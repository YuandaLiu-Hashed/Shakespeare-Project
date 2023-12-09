import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static int widthLimit = 700;
    public static Font firstFolioFont;
    public static BufferedImage oldPaperImage;
    public static HashMap<String, Clip> audioClips = new HashMap<>();
    public static Color getBgProximateColor(float alpha) {
        return new Color(1.0f, 0.91f, 0.80f, alpha);
    }
    public static Color getFillColor(float alpha) {
        return new Color(0.20f, 0.10f, 0.0f, alpha);
    }
    public static String pollAPIKey;

    public static boolean pollMode = false;

    public static void main(String[] args) {
        loadResources();
        if (args.length > 0 && args[0].equals("poll")) {
            if (pollAPIKey != null) {
                pollMode = true;
            } else {
                System.out.println("Forced to be in no-poll mode. API key not found.");
            }
        }
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

        ArrayList<String> audioManifest = new ArrayList<>();
        try {
            InputStream is = Main.class.getResourceAsStream("Audio-Manifest.txt");
            Scanner s = new Scanner(is);
            while (s.hasNextLine()) {
                audioManifest.add(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Unable to load audio manifest");
            System.out.println(e.toString());
        }

        for (String fileName: audioManifest) {
            try {
                InputStream is = Main.class.getResourceAsStream(fileName);
                AudioInputStream ais = AudioSystem.getAudioInputStream(is);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                if (audioClips.containsKey(fileName)) {
                    System.out.println("Duplicate audio file " + fileName);
                    continue;
                }
                audioClips.put(fileName, clip);
            } catch (Exception e) {
                System.out.println("Unable to load audio file " + fileName);
                System.out.println(e.toString());
            }
        }

        // To use interactive voting, create a .txt file named
        // 'Straw-Poll-API-Key.txt' into 'assets' folder, and put the Straw
        // Poll API Key in it. Then, add a Command Line argument 'poll' in the
        // project RUN configuration.

        try {
            InputStream is = Main.class.getResourceAsStream("Straw-Poll-API-Key.txt");
            Scanner s = new Scanner(is);
            if (!s.hasNext()) {
                throw new NoSuchFieldException("Unable to find API Key in API key file.");
            }
            String line = s.nextLine();
            if (line.length() != 36) {
                throw new NoSuchFieldException("Invalid API Key: " + line);
            }
            pollAPIKey = line;
        } catch (Exception e) {
            System.out.println("Unable to load Straw Poll API Key");
            System.out.println(e.toString());
        }
    }
}