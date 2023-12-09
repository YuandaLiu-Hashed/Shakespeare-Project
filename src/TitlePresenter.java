import java.awt.*;
import java.awt.image.BufferedImage;

public class TitlePresenter {

    static private final String title = "HAMLET";
    static private final String subtitle = "Act V Retold";
    private boolean shouldShow = true;

    private BufferedImage qrCode = null;

    private float factor = 0;

    boolean completedAnimation() {
        return (shouldShow && factor == 1) || (!shouldShow && factor == 0);
    }

    void show() {
        shouldShow = true;
    }

    void hide() {
        shouldShow = false;
    }

    void setQRCode(BufferedImage image) {
        qrCode = image;
    }

    public void draw(Graphics2D g2D, Dimension size) {
        if (!shouldShow && factor == 0) return;

        float rate = 1 / (Panel.FPS * 1.0f); // complete fade in 0.3 seconds
        if (shouldShow && factor < 1) {
            factor += rate;
            if (factor >= 1) factor = 1;
        }
        if (!shouldShow && factor > 0) {
            factor -= rate;
            if (factor <= 0) factor = 0;
        }

        g2D.setColor(Main.getFillColor(factor));
        // Draw title
        Font titleFont = Main.firstFolioFont.deriveFont(100.0f);
        g2D.setFont(titleFont);
        FontMetrics titleMetrics = g2D.getFontMetrics();

        float titleWidth = titleMetrics.stringWidth(title);
        g2D.drawString(title, (size.width - titleWidth) / 2f, size.height / 2f);

        // Draw subtitle
        Font subtitleFont = Main.firstFolioFont.deriveFont(30.0f);
        g2D.setFont(subtitleFont);
        FontMetrics subtitleMetrics = g2D.getFontMetrics();

        float subtitleWidth = subtitleMetrics.stringWidth(subtitle);
        g2D.drawString(subtitle, (size.width - subtitleWidth) / 2f, size.height / 2f + 40);

        // Draw image
        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, factor));

        if (qrCode != null) {
            g2D.drawImage(qrCode, size.width / 2 - 100, size.height / 2 + 20, 200, 200, null);
        }

        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
    }
}
