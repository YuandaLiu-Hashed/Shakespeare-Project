import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Stage {
    private final TextPresenter textPresenter = new TextPresenter();
    private final ControlPresenter controlPresenter = new ControlPresenter();
    private final AudioPresenter audioPresenter = new AudioPresenter();
    private final PollProgressPresenter pollProgressPresenter = new PollProgressPresenter();

    private final TitlePresenter titlePresenter = new TitlePresenter();
    private PollSystem pollSystem;

    private final Random random = new Random();


    private final ArrayList<GameEvent> events;
    private final HashMap<String, Integer> markerTable;
    private Instant pollStartedTime;

    private final ArrayList<String> jumpTable = new ArrayList<>();
    private String targetOption = null;
    private int programCounter = 0;
    private boolean waitingForUsrInput = false;
    private boolean waitingForAudioPlayback = false;
    private float pollTime = 20;

    Stage() {
        // build game
        GameBuilder builder = new GameBuilder();
        GameContent.buildGame(builder);

        if (Main.pollMode) {
            setupPoll();
        }

        events = builder.events;
        markerTable = builder.markerTable;

        // present title screen
        titlePresenter.show();
        controlPresenter.showOptions();
        waitingForUsrInput = true;

        // seed random
         random.setSeed(Instant.now().getEpochSecond() ^ 1023487508768295849L);
    }

    void setupPoll() {
        pollSystem = new PollSystem(Main.pollAPIKey);
        pollSystem.createPoll();
        System.out.println("Poll Created");
        System.out.println(pollSystem.getURL());
        titlePresenter.setQRCode(QRCodeCreator.createQRImage(pollSystem.getURL(), 128));

        // close the poll right before the program is closed
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                pollSystem.deletePoll();
                System.out.println("Poll Deleted");
            }
        }, "Poll Termination"));
    }

    void openVote() {
        pollStartedTime = Instant.now();
        String[] options = controlPresenter.getStyledOptions();
        pollSystem.updatePoll("Choice: ", options, (int)pollTime);
        System.out.println("Poll Updated");
        pollProgressPresenter.showBar();
    }

    void closeAndCountVote() {
        int[] result = pollSystem.getVoteResults();
        pollSystem.closeVoting();
        if (result.length != jumpTable.size()) {
            throw new IndexOutOfBoundsException("Invalid vote result");
        }
        // calculate the index with the most vote
        int maxValue = -1;
        ArrayList<Integer> maxIndices = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxValue) {
                maxValue = result[i];
                maxIndices.clear();
                maxIndices.add(i);
            } else if (result[i] == maxValue) {
                maxIndices.add(i);
            }
        }
        System.out.println("Poll Chosen");
        int choice;
        if (maxIndices.size() > 1) {
            choice = maxIndices.get(random.nextInt(maxIndices.size()));
        } else {
            choice = maxIndices.get(0);
        }
        choose(choice);
        pollProgressPresenter.hideBar();
    }

    private boolean canProceed() {
        if (waitingForAudioPlayback && audioPresenter.finishedPlaying()) {
            waitingForAudioPlayback = false;
        }
        return controlPresenter.completedAnimation() && titlePresenter.completedAnimation() && !waitingForUsrInput && !waitingForAudioPlayback;
    }

    private void updateStage() {
        if (programCounter >= events.size()) return;
        while (canProceed()) {
            GameEvent event = events.get(programCounter);
            switch (event.type) {
                case AddText: {
                    textPresenter.addTextEvent((AddTextGameEvent) event);
                    programCounter++;
                    break;
                }
                case ClearText: {
                    textPresenter.clearText();
                    programCounter++;
                    break;
                }
                case AddOption: {
                    AddOptionGameEvent opt = (AddOptionGameEvent)event;
                    controlPresenter.addOption(opt.prompt);
                    jumpTable.add(opt.mark);
                    targetOption = null;
                    programCounter++;
                    break;
                }
                case Jump: {
                    JumpGameEvent jmp = (JumpGameEvent)event;
                    programCounter = markerTable.get(jmp.mark);
                    break;
                }
                case TakeOption: {
                    if (targetOption == null) {
                        System.out.println("ERROR: No option taken.");
                        System.exit(1);
                    }
                    programCounter = markerTable.get(targetOption);
                    break;
                }
                case SetPollTime: {
                    SetPollTimeGameEvent setPollTimeGameEvent = (SetPollTimeGameEvent)event;
                    pollTime = setPollTimeGameEvent.pollTime;
                    programCounter++;
                    break;
                }
                case PresentAndWait: {
                    PresentAndWaitGameEvent wait = (PresentAndWaitGameEvent)event;
                    if (wait.options.contains(WaitOptions.UserInteraction)) {
                        controlPresenter.showOptions();
                        targetOption = null;
                        waitingForUsrInput = true;
                        if (!jumpTable.isEmpty() && Main.pollMode) {
                            openVote();
                        }
                    }
                    if (wait.options.contains(WaitOptions.AudioPlayback)) {
                        waitingForAudioPlayback = true;
                    }
                    programCounter++;
                    break;
                }
                case End: {
                    System.exit(0);
                    break;
                }
                case PlayAudio: {
                    PlayAudioGameEvent playEvent = (PlayAudioGameEvent)event;
                    audioPresenter.playClip(playEvent.fileName);
                    programCounter++;
                    break;
                }
            }
        }
    }

    void chooseSkip() {
        if (!jumpTable.isEmpty()) return;
        controlPresenter.skip();
        waitingForUsrInput = false;
        titlePresenter.hide();
    }

    void choose(int option) {
        if (option < 0 || option >= jumpTable.size()) return;
        controlPresenter.chooseOptions(option);
        targetOption = jumpTable.get(option);
        jumpTable.clear();
        waitingForUsrInput = false;
    }

    public void drawStage(Graphics g, Dimension size) {
        Graphics2D g2D = (Graphics2D)g;

        if (Main.oldPaperImage != null) {
            g2D.drawImage(Main.oldPaperImage, 0, 0, (int) size.getWidth(), (int) size.getHeight(), null);
        }

        if (Main.pollMode && waitingForUsrInput && !jumpTable.isEmpty()) {
            Instant currentTime = Instant.now();
            long timeSinceStart = ChronoUnit.MILLIS.between(pollStartedTime, currentTime);

            float fraction = timeSinceStart / (pollTime * 1000f);
            pollProgressPresenter.setFraction(fraction);

            if (fraction >= 1) {
                closeAndCountVote();
            }
        }

        updateStage();

        textPresenter.draw(g2D, size, 180);
        controlPresenter.draw(g2D, size, 180);
        pollProgressPresenter.draw(g2D, size, 180);
        titlePresenter.draw(g2D, size);
        audioPresenter.update();
    }
}
