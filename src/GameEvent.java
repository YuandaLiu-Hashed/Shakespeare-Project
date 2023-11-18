abstract class GameEvent {
    protected GameEventType type;
    GameEvent(GameEventType type) {
        this.type = type;
    }
    public GameEventType getType() {
        return type;
    }
}

enum GameEventType {
    AddText, ClearText, Jump, AddOption, TakeOption, PresentAndWait, End
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

class PresentAndWaitGameEvent extends GameEvent {
    PresentAndWaitGameEvent() {
        super(GameEventType.PresentAndWait);
    }
}

class EndGameEvent extends GameEvent {
    EndGameEvent() {
        super(GameEventType.End);
    }
}