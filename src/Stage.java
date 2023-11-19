import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Stage {
    private TextPresenter textPresenter = new TextPresenter();
    private ControlPresenter controlPresenter = new ControlPresenter();

    private final ArrayList<GameEvent> events;
    private final HashMap<String, Integer> markerTable;

    private final ArrayList<String> jumpTable = new ArrayList<>();
    private String targetOption = null;
    private int programCounter = 0;
    private boolean waiting = false;

    Stage() {
        // build game
        GameBuilder builder = new GameBuilder();
        GameContent.buildGame(builder);

        events = builder.events;
        markerTable = builder.markerTable;
    }

    private boolean canProceed() {
        return controlPresenter.completedAnimation() && !waiting;
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
                case PresentAndWait: {
                    controlPresenter.showOptions();
                    targetOption = null;
                    waiting = true;
                    programCounter++;
                    break;
                }
                case End: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    void chooseSkip() {
        if (!jumpTable.isEmpty()) return;
        controlPresenter.skip();
        waiting = false;
    }

    void choose(int option) {
        if (option < 0 || option >= jumpTable.size()) return;
        controlPresenter.chooseOptions(option);
        targetOption = jumpTable.get(option);
        jumpTable.clear();
        waiting = false;
    }

    public void drawStage(Graphics g, Dimension size) {
        int midX = size.width / 2;
        int midY = size.height / 2;

        Graphics2D g2D = (Graphics2D)g;

        updateStage();

        textPresenter.draw(g2D, size, 180);
        controlPresenter.draw(g2D, size, 180);
    }
}
