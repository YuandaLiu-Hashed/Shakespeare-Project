import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GameBuilder {

    ArrayList<GameEvent> events = new ArrayList<>();
    HashMap<String, Integer> markerTable = new HashMap<>();

    public void verify() {
        HashSet<String> usedMarkers = new HashSet<>();
        for (GameEvent event: events) {
            switch (event.type) {
                case AddOption: {
                    AddOptionGameEvent e = (AddOptionGameEvent) event;
                    if (!markerTable.containsKey(e.mark)) {
                        System.out.println("ERROR: Marker " + e.mark + " doesn't exist");
                        System.exit(1);
                    }
                    usedMarkers.add(e.mark);
                    break;
                }
                case Jump: {
                    JumpGameEvent e = (JumpGameEvent) event;
                    if (!markerTable.containsKey(e.mark)) {
                        System.out.println("ERROR: Marker " + e.mark + " doesn't exist");
                        System.exit(1);
                    }
                    usedMarkers.add(e.mark);
                    break;
                }
                default:
                    break;
            }
        }
        for (String mark: markerTable.keySet()) {
            if (!usedMarkers.contains(mark)) {
                System.out.println("WARNING: Marker " + mark + " is defined but not used");
            }
        }
    }

    public void addText(String text) {
        GameEvent event = new AddTextGameEvent(text);
        events.add(event);
    }

    public void clearText() {
        GameEvent event = new ClearTextGameEvent();
        events.add(event);
    }

    public void jumpTo(String mark) {
        GameEvent event = new JumpGameEvent(mark);
        events.add(event);
    }

    public void addOption(String prompt, String mark) {
        GameEvent event = new AddOptionGameEvent(prompt, mark);
        events.add(event);
    }

    public void takeOption() {
        GameEvent event = new TakeOptionGameEvent();
        events.add(event);
    }

    public void presentAndWait() {
        GameEvent event = new PresentAndWaitGameEvent();
        events.add(event);
    }

    public void endGame() {
        GameEvent event = new EndGameEvent();
        events.add(event);
    }

    public void mark(String mark) {
        if (markerTable.containsKey(mark)) {
            System.out.println("ERROR: Duplicate marker " + mark);
            System.exit(1);
        }
        markerTable.put(mark, events.size());
    }
}
