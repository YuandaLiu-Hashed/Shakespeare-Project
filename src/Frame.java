import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Panel panel = new Panel();
    Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        setSize(700, 600);
        setMinimumSize(new Dimension(Main.widthLimit, 600));
        setTitle("Shakespeare Project");
    }
}
