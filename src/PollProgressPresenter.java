import java.awt.*;

public class PollProgressPresenter {

    private boolean shouldShow = false;
    private float factor;
    private float fraction;
    void setFraction(float fraction) {
        this.fraction = fraction;
    }

    void showBar() {
        shouldShow = true;
        fraction = 0;
    }

    void hideBar() {
        shouldShow = false;
    }

    public void draw(Graphics2D g2D, Dimension size, float reservedBottom) {
        float showRate = 1 / (Panel.FPS * 0.3f); // complete fade in 0.5 seconds
        float hideRate = 1 / (Panel.FPS * 0.7f); // complete fade in 0.5 seconds

        if (shouldShow && factor < 1) {
            factor += showRate;
            if (factor >= 1) factor = 1;
        }

        if (!shouldShow && factor > 0) {
            factor -= hideRate;
            if (factor <= 0) factor = 0;
        }

        g2D.setColor(Main.getFillColor(factor));
        g2D.fillRect(0, (int)(size.height - reservedBottom),
                (int)(size.width * fraction), 20);
    }
}
