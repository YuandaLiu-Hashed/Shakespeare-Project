import java.awt.*;
import java.util.ArrayList;

public class ControlPresenter {

    private final ArrayList<String> options = new ArrayList<>();

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

    public String[] getStyledOptions() {
        String[] styledOptions = new String[options.size()];
        for (int i = 0; i < options.size(); i++) {
            String index = Alphabet.substring(i, i+1);
            styledOptions[i] = "[" + index + "] " + options.get(i);
        }
        return styledOptions;
    }

    // Constants
    static final float OptionHeight = 40;
    static final float IndexBoxSize = 38;
    static final float SelectionInset = 1.5f;
    static final Stroke SelectionStoke = new BasicStroke(3);
    static final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void draw(Graphics2D g2D, Dimension size, float reservedBottom) {
        float stageLeftBound  = (float)(size.width - Main.widthLimit) / 2;
        float stageRightBound = (float)(size.width + Main.widthLimit) / 2;

        Font font = Main.firstFolioFont.deriveFont(22.0f);
        g2D.setFont(font);

        // animate factor
        float shortRate = 1 / (Panel.FPS * 0.3f); // complete fade in 0.3 seconds
        float longRate = 1 / (Panel.FPS * 1.2f);  // complete fade in 1.2 seconds

        if (shouldShow && factor < 1) {
            factor += shortRate;
            if (factor >= 1) factor = 1;
        }

        if (!shouldShow && factor > 0) {
            if (options.isEmpty()) {
                factor -= shortRate;
            } else {
                factor -= longRate;
            }
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
                optionFactor = Math.max(Math.min(factor * 3, 1), 0);
            } else {
                optionFactor = Math.max(Math.min(factor * 3 - 2, 1), 0);
            }

            String option = options.get(i);

            float midY = size.height - reservedBottom + padding + OptionHeight * i + OptionHeight / 2;

            // draw selection box
            if (i == selected) {
                // draw wire box
                g2D.setStroke(SelectionStoke);
                g2D.setColor(Main.getFillColor(optionFactor));
                g2D.drawRect(
                        (int)(stageLeftBound + 10 + SelectionInset),
                        (int)(midY - IndexBoxSize / 2 + SelectionInset),
                        (int)(IndexBoxSize - SelectionInset * 2),
                        (int)(IndexBoxSize - SelectionInset * 2)
                );

                // set index to be dark
                g2D.setColor(Main.getFillColor(optionFactor));
            } else {
                // draw box
                g2D.setColor(Main.getFillColor(optionFactor));
                g2D.fillRect(
                        (int)(stageLeftBound + 10),
                        (int)(midY - IndexBoxSize / 2),
                        (int)IndexBoxSize,
                        (int)IndexBoxSize
                );
                // set index to be bright
                g2D.setColor(Main.getBgProximateColor(optionFactor));
            }

            // draw index in box
            String index = Alphabet.substring(i, i+1);
            float indexWidth = metrics.stringWidth(index);
            g2D.drawString(index, stageLeftBound + 10 + IndexBoxSize / 2.0f - indexWidth / 2.0f,
                    midY + fontHeight / 2.0f);

            // draw option string
            g2D.setColor(Main.getFillColor(optionFactor));
            g2D.drawString(option, stageLeftBound + 10 + IndexBoxSize + 10, midY + fontHeight / 2.0f);
        }

        // draw skip
        if (options.isEmpty()) {
            float midY = size.height - padding;
            g2D.setColor(Main.getFillColor(factor));

            if (shouldShow) {
                g2D.fillRect((int)stageRightBound - 10 - 100, (int)(midY - IndexBoxSize / 2), 100, (int)IndexBoxSize);
                g2D.setColor(Main.getBgProximateColor(factor));
            } else {
                g2D.setStroke(SelectionStoke);
                g2D.drawRect(
                        (int)(stageRightBound - 10 - 100 + SelectionInset),
                        (int)(midY - IndexBoxSize / 2 + SelectionInset),
                        (int)(100 - SelectionInset * 2),
                        (int)(IndexBoxSize - SelectionInset * 2)
                );
            }

            String skip = "NEXT";
            float skipWidth = metrics.stringWidth(skip);
            g2D.drawString("NEXT", stageRightBound - 10 - 50 - skipWidth / 2, midY + fontHeight / 2.0f);
        }
    }
}
