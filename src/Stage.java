import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Stage {
    private TextPresenter textPresenter = new TextPresenter();
    private ControlPresenter controlPresenter = new ControlPresenter();
    private AudioPresenter audioPresenter = new AudioPresenter();


    private final ArrayList<GameEvent> events;
    private final HashMap<String, Integer> markerTable;

    private final ArrayList<String> jumpTable = new ArrayList<>();
    private String targetOption = null;
    private int programCounter = 0;
    private boolean waitingForUsrInput = false;
    private boolean waitingForAudioPlayback = false;

    Stage() {
        // build game
        GameBuilder builder = new GameBuilder();
        GameContent.buildGame(builder);

        events = builder.events;
        markerTable = builder.markerTable;
    }

    private boolean canProceed() {
        if (waitingForAudioPlayback && audioPresenter.finishedPlaying()) {
            waitingForAudioPlayback = false;
        }
        return controlPresenter.completedAnimation() && !waitingForUsrInput && !waitingForAudioPlayback;
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
                    PresentAndWaitGameEvent wait = (PresentAndWaitGameEvent)event;
                    if (wait.options.contains(WaitOptions.UserInteraction)) {
                        controlPresenter.showOptions();
                        targetOption = null;
                        waitingForUsrInput = true;
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
    }

    void choose(int option) {
        if (option < 0 || option >= jumpTable.size()) return;
        controlPresenter.chooseOptions(option);
        targetOption = jumpTable.get(option);
        jumpTable.clear();
        waitingForUsrInput = false;
    }

    public void drawStage(Graphics g, Dimension size) {
        int midX = size.width / 2;
        int midY = size.height / 2;

        Graphics2D g2D = (Graphics2D)g;

        if (Main.oldPaperImage != null) {
            g2D.drawImage(Main.oldPaperImage, 0, 0, (int) size.getWidth(), (int) size.getHeight(), null);
        }

        updateStage();

        textPresenter.draw(g2D, size, 180);
        controlPresenter.draw(g2D, size, 180);
        audioPresenter.update();
    }
}
