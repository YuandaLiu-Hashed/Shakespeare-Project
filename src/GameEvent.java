import java.util.Set;

abstract class GameEvent {
    protected GameEventType type;
    GameEvent(GameEventType type) {
        this.type = type;
    }
}

enum GameEventType {
    AddText, ClearText, Jump, AddOption, TakeOption, PresentAndWait, End, PlayAudio
}

enum WaitOptions {
    UserInteraction, AudioPlayback
}

class AddTextGameEvent extends GameEvent {
    final String text;
    AddTextGameEvent(String text) {
        super(GameEventType.AddText);
        this.text = text;
    }
}

class ClearTextGameEvent extends GameEvent {
    ClearTextGameEvent() {
        super(GameEventType.ClearText);
    }
}

class JumpGameEvent extends GameEvent {
    final String mark;
    JumpGameEvent(String mark) {
        super(GameEventType.Jump);
        this.mark = mark;
    }
}

class AddOptionGameEvent extends GameEvent {
    final String prompt;
    final String mark;
    AddOptionGameEvent(String prompt, String mark) {
        super(GameEventType.AddOption);
        this.prompt = prompt;
        this.mark = mark;
    }
}

class TakeOptionGameEvent extends GameEvent {
    TakeOptionGameEvent() {
        super(GameEventType.TakeOption);
    }
}

class PlayAudioGameEvent extends GameEvent {
    final String fileName;
    PlayAudioGameEvent(String fileName) {
        super(GameEventType.PlayAudio);
        this.fileName = fileName;
    }
}

class PresentAndWaitGameEvent extends GameEvent {
    Set<WaitOptions> options;
    PresentAndWaitGameEvent(Set<WaitOptions> options) {
        super(GameEventType.PresentAndWait);
        this.options = options;
    }
}

class EndGameEvent extends GameEvent {
    EndGameEvent() {
        super(GameEventType.End);
    }
}