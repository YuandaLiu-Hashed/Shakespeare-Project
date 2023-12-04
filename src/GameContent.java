import java.util.Set;

public class GameContent {
    static void buildGame(GameBuilder builder) {
        GameContent.buildExampleGame(builder);
    }

    static void buildExampleGame(GameBuilder builder) {

        builder.addText("pretium nibh ipsum consequat nisl vel pretium lectus quam id leo in vitae turpis massa sed elementum tempus egestas sed sed risus pretium quam vulputate dignissim suspendisse in est ante in nibh mauris cursus mattis molestie a iaculis at erat pellentesque adipiscing commodo elit at imperdiet dui accumsan sit amet nulla facilisi morbi tempus iaculis urna id volutpat lacus laoreet non curabitur gravida arcu ac tortor dignissim convallis aenean et tortor at risus viverra adipiscing at in tellus integer feugiat scelerisque varius morbi enim nunc faucibus a pellentesque sit amet porttitor eget dolor morbi non arcu risus quis varius quam");
        builder.addText("Hello this is a example text.");
        builder.presentAndWait();

        builder.addText("This is another example text.");
        builder.presentAndWait();
        builder.clearText();

        builder.addText("This is a example choice:");
        builder.addOption("Option A", "A");
        builder.addOption("Option B", "B");
        builder.playAudio("dummy.wav");

        builder.presentAndWait();

        builder.clearText();
        builder.takeOption();

        //----------------------------------------------------------------------
        // Option A
        //----------------------------------------------------------------------
        builder.mark("A");
        builder.addText("You got ending A");
        builder.presentAndWait();
        builder.endGame();

        //----------------------------------------------------------------------
        // Option B
        //----------------------------------------------------------------------
        builder.mark("B");
        builder.addText("You got ending B");
        builder.presentAndWait();
        builder.endGame();

        builder.verify();
    }
}
