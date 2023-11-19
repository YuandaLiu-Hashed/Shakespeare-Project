# Shakespeare-Project
GT COMM 3288 Team Awesome

A Hamlet choose your own adventure game.

# Building the Project

1. Download IntelliJ IDEA, community edition is fine
3. Install Github (Github Desktop App recommended)
4. Clone this repo to local
5. Open the directory of this repo, and IntelliJ should recognize it.

# Play the Game

Currently mouse interactions are not implemented. The 1, 2, 3, and 4 key are the A, B, C, and D choises, and the enter key is "NEXT".

# Story System
The story is generated once at the start of the program in the static function `buildGame` in `GameContent`.

```java
public class GameContent {
    static void buildGame(GameBuilder builder) {
        // Generation Code Goes Here
    }
}
```

This allows any story to be built in a relatively easy manner. Take the following code for example:

```java
public class GameContent {
    static void buildGame(GameBuilder builder) {

        // add the following text to the screen, and wait for user to press "NEXT"
        builder.addText("Hello this is a example text.");
        builder.presentAndWait();

        // add the following text to the screen, and wait for user to press "NEXT"
        builder.addText("This is another example text.");
        builder.presentAndWait();

        // clear the existing text on the screen
        builder.clearText();
        
        // add a new line of text onto the screen
        builder.addText("This is a example choice:");
        
        // register options, and present them
        builder.addOption("Option A", "A");
        builder.addOption("Option B", "B");
        builder.presentAndWait();
        
        // clear the text on the screen regardless of the options chosen
        builder.clearText();
        
        // take the option previously chosen
        // this will jump using markers specified by the second operand in addOption
        builder.takeOption();

        //----------------------------------------------------------------------
        // Option A
        //----------------------------------------------------------------------
        
        // marks this location as a jump target called "A", used previously in addOption
        builder.mark("A");
        
        // print some text, wait for user to press "NEXT" and terminate the game
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

        // Verify that the sequence built before is error free
        builder.verify();
    }
}
```

For all available methods, see the `GameBuilder` class
