public class GameContent {
    static void buildGame(GameBuilder builder) {

        builder.addText("Hello this is a example text.");
        builder.presentAndWait();

        builder.addText("This is another example text.");
        builder.presentAndWait();
        builder.clearText();

        builder.addText("This is a example choice:");
        builder.addOption("Option A", "A");
        builder.addOption("Option B", "B");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // Option B
        //----------------------------------------------------------------------
        builder.mark("A");
        builder.addText("You got ending A");
        builder.presentAndWait();
        builder.endGame();

        //----------------------------------------------------------------------
        // Option A
        //----------------------------------------------------------------------
        builder.mark("B");
        builder.addText("You got ending B");
        builder.presentAndWait();
        builder.endGame();

        builder.verify();
    }
}
