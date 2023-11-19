import java.awt.*;
import java.io.InputStream;

public class Main {

    public static Font firstFolioFont;

    public static void main(String[] args) {
        loadResources();
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    private static void loadResources() {
        try {
            InputStream is = Main.class.getResourceAsStream("Hamletornot-K7y7.ttf");
            firstFolioFont = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception e) {
            System.out.println("Unable to load font");
            System.out.println(e.toString());
            firstFolioFont = new Font("Courier", Font.PLAIN, 20);;
        }
    }
}