import java.awt.*;
import java.util.ArrayList;

public class ControlPressenter {

    private ArrayList<String> options = new ArrayList<>();

    private boolean shouldShow = false;
    private float factor = 0;
    private int selected = -1;

    void chooseOptions(int i) {
        selected = i;
        shouldShow = false;
    }

    void skip() {
        shouldShow = false;
    }

    void showOptions() {
        shouldShow = true;
    }

    void addOption(String option) {
        options.add(option);
    }

    boolean completedAnimation() {
        return (shouldShow && factor == 1) || (!shouldShow && factor == 0);
    }

    static float OptionHeight = 40;
    static float IndexBoxSize = 38;
    static float SelectionInset = 3;
    static Stroke SelectionStoke = new BasicStroke(2);
    static String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void draw(Graphics2D g2D, Dimension size, float reservedBottom) {

        Font font = new Font("Courier", Font.PLAIN, 20);
        g2D.setFont(font);


        // animate factor
        float showRate = 1 / (Panel.FPS * 0.3f); // complete fade in 0.5 seconds
        float hideRate = 1 / (Panel.FPS * 0.7f); // complete fade in 0.5 seconds

        if (shouldShow && factor < 1) {
            factor += showRate;
            if (factor >= 1) factor = 1;
        }

        if (!shouldShow && factor > 0) {
            factor -= hideRate;
            if (factor <= 0) {
                factor = 0;
                options.clear();
                selected = -1;
            }
        }

        float padding = (reservedBottom - OptionHeight * options.size()) / 2;

        FontMetrics metrics = g2D.getFontMetrics();
        float fontHeight = metrics.getAscent() - metrics.getDescent();

        // draw options
        for (int i = 0; i < options.size(); i++) {
            float optionFactor;
            if (i == selected) {
                optionFactor = Math.min(factor * 3, 1);
            } else {
                optionFactor = factor;
            }

            String option = options.get(i);

            float midY = size.height - reservedBottom + padding + OptionHeight * i + OptionHeight / 2;

            // draw box
            g2D.setColor(new Color(0, 0, 0, optionFactor));
            g2D.fillRect(10, (int)(midY - IndexBoxSize / 2), (int)IndexBoxSize, (int) IndexBoxSize);

            // draw selection box
            if (i == selected) {
                g2D.setStroke(SelectionStoke);
                g2D.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
                g2D.drawRect(
                        (int)(10 + SelectionInset),
                        (int)(midY - IndexBoxSize / 2 + SelectionInset),
                        (int)(IndexBoxSize - SelectionInset * 2),
                        (int)(IndexBoxSize - SelectionInset * 2)
                );
            }

            // draw index in box
            g2D.setColor(new Color(1, 1, 1, optionFactor));
            String index = Alphabet.substring(i, i+1);
            float indexWidth = metrics.stringWidth(index);
            g2D.drawString(index, 10 + IndexBoxSize / 2.0f - indexWidth / 2.0f,
                    midY + fontHeight / 2.0f);

            // draw option string
            g2D.setColor(new Color(0, 0, 0, optionFactor));
            g2D.drawString(option, 10 + IndexBoxSize + 10, midY + fontHeight / 2.0f);
        }

        // draw skip
        if (options.isEmpty()) {
            float midY = size.height - padding;
            g2D.setColor(new Color(0, 0, 0, factor));
            g2D.fillRect(size.width - 10 - 100, (int)(midY - IndexBoxSize / 2), 100, (int)IndexBoxSize);
            g2D.setColor(new Color(1, 1, 1, factor));

            if (!shouldShow) {
                g2D.setStroke(SelectionStoke);
                g2D.drawRect(
                        (int)(size.width - 10 - 100 + SelectionInset),
                        (int)(midY - IndexBoxSize / 2 + SelectionInset),
                        (int)(100 - SelectionInset * 2),
                        (int)(IndexBoxSize - SelectionInset * 2)
                );
            }

            String skip = "NEXT";
            float skipWidth = metrics.stringWidth(skip);
            g2D.drawString("NEXT", size.width - 10 - 50 - skipWidth / 2, midY + fontHeight / 2.0f);
        }
    }
}
