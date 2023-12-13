
import java.net.URI;
import java.net.http.*;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

public class PollSystem {

    private String pollID;
    private String URL;

    private String title;
    private String[] choices;
    private String[] pollOptionsIDs; // necessary for updating the poll

    private Integer[] voteResults;
    private int expectedVoteCount;

    private long deadline; // unix epoch time
    /*** Note: voting does not automatically close when the deadline passes.
     closeVoting() must be called explicitly when time is up. ***/

    private String apiKey;

    PollSystem(String apiKey) {
        this.apiKey = apiKey;
    }

    public void createPoll() {
        title = "Ready to vote?";
        choices = new String[] {"Yes", "Yes", "Yes"};

        // Sending POST Request to the API
        HttpResponse<String> response;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls"))
                .header("Content-Type", "application/json")
                .header("X-API-Key", apiKey)
                .method("POST", HttpRequest.BodyPublishers.ofString(postRequestJSON()))
                .build();
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error occured in createPoll method:\n" + e.toString());
            return;
        }

        String responseBody = response.body();
        // Parsing through responseBody to find the poll's id
        pollID = (responseBody.split("\"id\":\"")[1]).split("\"")[0];
        URL = "strawpoll.com/embed/" + pollID;

        setPollOptionsIDs(responseBody.split("\"poll_options\":")[1]); // The ids corresponding to each choice will be used to perform the first poll update
        hideEmbedVoteCount(); // Hides vote count on the users' end, which does not update unless the web page is refreshed
    }


    public void updatePoll(String updatedTitle, String[] updatedChoices, int secondsTillClosing) {

        resetPoll(); // Clearing votes from the last poll
        long currentUnixTime = Instant.now().getEpochSecond();
        deadline = currentUnixTime + secondsTillClosing;

        // Sending PUT Request to the API
        HttpResponse<String> response;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls/" + pollID))
                .header("Content-Type", "application/json")
                .header("X-API-Key", apiKey)
                .method("PUT", HttpRequest.BodyPublishers.ofString(putRequestJSON(updatedTitle, updatedChoices, currentUnixTime)))
                .build();
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error occured in updatePoll method:\n" + e.toString());
            return;
        }

        title = updatedTitle;
        choices = updatedChoices;

        String responseBody = response.body();
        setPollOptionsIDs(responseBody.split("\"poll_options\":")[1]); // The ids corresponding to each choice will be used to perform the next poll update
    }


    public void closeVoting() {
        updatePoll(title, choices, -60);
    }


    public Integer[] getVoteResults() {
        // Sending GET Request to the API
        HttpResponse<String> response;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls/" + pollID + "/results"))
                .header("X-API-Key", apiKey)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error occured in getVoteResults method:\n" + e.toString());
            return new Integer[] {-1}; // returns an array containing -1
        }

        voteResults = new Integer[choices.length];

        // Parsing through the response body to get the vote counts
        String responseBodySubstring = response.body().split("\"poll_options\":")[1];
        String[] voteCountsArray = responseBodySubstring.split("\"vote_count\":");
        for (int i = 0; i < choices.length; i++) {
            String voteCount = (voteCountsArray[1 + i]).split("}")[0];
            voteResults[i] = Integer.parseInt(voteCount);
        }

        return voteResults;
    }


    public void deletePoll() {
        // Sending DELETE Request to the API
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls/" + pollID))
                .header("X-API-Key", apiKey)
                .method("DELETE", HttpRequest.BodyPublishers.noBody())
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error occured in deletePoll method:\n" + e.toString());
        }
    }

    public String getURL() {
        return URL;
    }

    //////////// HELPER METHODS \\\\\\\\\\

    private String postRequestJSON() {
        // Helper method for createPoll()

        String requestBody = String.format("{\"title\": \"%s\", \"poll_options\": [{\"value\": \"%s\"}", title, choices[0]);
        for (int i = 1; i < choices.length; i++) {
            requestBody += String.format(", {\"value\": \"%s\"}", choices[i]);
        }
        requestBody += "], \"poll_config\": {\"is_private\": true, \"allow_comments\": false, \"allow_indeterminate\": false, \"allow_other_option\": false, \"duplication_checking\": \"ip\", \"allow_vpn_users\": true, \"edit_vote_permissions\": \"nobody\", \"hide_participants\": true, \"is_multiple_choice\": false, \"number_of_winners\": 1, \"randomize_options\": false, \"require_voter_names\": false, \"results_visibility\": \"hidden\"}, \"poll_meta\": {\"timezone\": \"EST\"}, \"theme\": {\"id\": \"Qe2na0WMyBO\"}, \"type\": \"multiple_choice\"}";

        return requestBody;
    }


    private void setPollOptionsIDs(String responseBodySubstring) {
        // Helper method for createPoll() and updatePoll()

        pollOptionsIDs = new String[choices.length];
        String[] idsArray = responseBodySubstring.split("\"id\":\"");

        for (int i = 0; i < choices.length; i++) {
            String pollOptionID = (idsArray[1 + i]).split("\"")[0];
            pollOptionsIDs[i] = pollOptionID;
        }
    }


    private void hideEmbedVoteCount() {
        // Helper method for createPoll()
        // Aync API call - Hides the number of votes on users' end (i.e., strawpoll.com/embed/poll_id)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls/" + pollID))
                .header("Content-Type", "application/json")
                .header("X-API-Key", apiKey)
                .method("PATCH", HttpRequest.BodyPublishers.ofString("{\"poll\": {\"poll_config\": {\"hide_embed_vote_count\": true}}}"))
                .build();
        CompletableFuture<HttpResponse<String>> response = HttpClient.newHttpClient().sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }


    private String putRequestJSON(String updatedTitle, String[] updatedChoices, long currentUnixTime) {
        // Helper method for updatePoll()

        // The list "poll_options" contains the choices that need to be added
        String requestBody = String.format("{\"title\": \"%s\", \"poll_options\": [{\"value\": \"%s\"}", updatedTitle, updatedChoices[0]);
        for (int i = 1; i < updatedChoices.length; i++) {
            requestBody += String.format(", {\"value\": \"%s\"}", updatedChoices[i]);
        }

        // "deadline_at" is set to null unless the deadline has passed. This is to avoid displaying "voting ends in . " (without actually showing the number of seconds left) while voting is in progress.
        if (deadline > currentUnixTime) {
            requestBody += "], \"poll_config\": {\"deadline_at\": null, ";
        } else {
            requestBody += String.format("], \"poll_config\": {\"deadline_at\": %d, ", deadline);
        }

        // The list "remove_poll_options" contains ids of choices that need to be removed, which is all the options from the previous poll (i.e., the poll prior to the update)
        requestBody += String.format("\"is_private\": true, \"allow_comments\": false, \"allow_indeterminate\": false, \"allow_other_option\": false, \"duplication_checking\": \"ip\", \"allow_vpn_users\": true, \"edit_vote_permissions\": \"nobody\", \"hide_participants\": true, \"is_multiple_choice\": false, \"number_of_winners\": 1, \"randomize_options\": false, \"require_voter_names\": false, \"results_visibility\": \"hidden\"}, \"poll_meta\": {\"timezone\": \"EST\"}, \"theme\": {\"id\": \"Qe2na0WMyBO\"}, \"type\": \"multiple_choice\", \"remove_poll_options\": [{\"id\": \"%s\"}", pollOptionsIDs[0]);
        for (int j = 1; j < pollOptionsIDs.length; j++) {
            requestBody += String.format(", {\"id\": \"%s\"}", pollOptionsIDs[j]);
        }
        requestBody += "]}";

        return requestBody;
    }


    private void resetPoll() {
        // Helper method for updatePoll()
        // API call - clears votes and sets deadline to null
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.strawpoll.com/v3/polls/" + pollID + "/results"))
                .header("X-API-Key", apiKey)
                .method("DELETE", HttpRequest.BodyPublishers.noBody())
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error occured in resetPoll method:\n" + e.toString());
        }
    }

}