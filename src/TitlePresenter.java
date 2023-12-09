import java.awt.*;
import java.awt.image.BufferedImage;

public class TitlePresenter {

    static private final String title = "HAMLET";
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

        Font font = Main.firstFolioFont.deriveFont(100.0f);

        float rate = 1 / (Panel.FPS * 1.0f); // complete fade in 0.3 seconds
        if (shouldShow && factor < 1) {
            factor += rate;
            if (factor >= 1) factor = 1;
        }
        if (!shouldShow && factor > 0) {
            factor -= rate;
            if (factor <= 0) factor = 0;
        }

        g2D.setFont(font);
        FontMetrics metrics = g2D.getFontMetrics();

        float titleWidth = metrics.stringWidth(title);

        g2D.setColor(Main.getFillColor(factor));
        g2D.drawString(title, (size.width - titleWidth) / 2f, size.height / 2f);

        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, factor));

        if (qrCode != null) {
            g2D.drawImage(qrCode, size.width / 2 - 100, size.height / 2 + 10, 200, 200, null);
        }

        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
    }
}
