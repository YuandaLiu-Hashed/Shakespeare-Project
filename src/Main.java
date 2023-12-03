import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class Main {

    public static Font firstFolioFont;
    public static BufferedImage oldPaperImage;
    public static Color getBgProximateColor(float alpha) {
        return new Color(1.0f, 0.91f, 0.80f, alpha);
    }
    public static Color getFillColor(float alpha) {
        return new Color(0.20f, 0.10f, 0.0f, alpha);
    }

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

        try {
            InputStream is = Main.class.getResourceAsStream("Old-Paper.jpg");
            oldPaperImage = ImageIO.read(is);
        } catch (Exception e) {
            System.out.println("Unable to load old paper image");
            System.out.println(e.toString());
            oldPaperImage = null;
        }
    }
}