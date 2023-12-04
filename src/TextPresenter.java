import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.LinkedList;

public class TextPresenter {
    private enum PresentationStage {
        entering, entered, exiting, exited
    }

    private final ArrayList<TextElement> elements = new ArrayList<>();
    private final LinkedList<AddTextGameEvent> pendingEvents = new LinkedList<>();

    private static class TextElement {
        float yPos = 0;

        float yPosTarget = 0;

        PresentationStage stage = PresentationStage.entering;
        float factor = 0;
        final String text;
        final Dimension size;

        TextElement(String text, Font font, FontRenderContext context) {
            this.text = text;

            GlyphVector vector = font.createGlyphVector(context, text);
            Rectangle2D rect = vector.getLogicalBounds();
            size = new Dimension((int)rect.getWidth(), (int)rect.getHeight());
        }

        void setInitialPosition(float y) {
            yPos = y;
            yPosTarget = y;
        }
    }

    void addTextEvent(AddTextGameEvent event) {
        pendingEvents.add(event);
    }

    void clearText() {
        for (TextElement element: elements) {
            element.stage = PresentationStage.exiting;
        }
    }

    public void draw(Graphics2D g2D, Dimension size, float reservedBottom) {

        Font font = Main.firstFolioFont.deriveFont(28.0f);
        g2D.setFont(font);

        FontRenderContext context = g2D.getFontRenderContext();

        // Place all new elements to the bottom of the existing elements
        float yBottom = 0;
        boolean hasNew = false;
        while (!pendingEvents.isEmpty()) {
            hasNew = true;
            AddTextGameEvent event = pendingEvents.removeFirst();
            TextElement newTextElement = new TextElement(event.text, font, context);
            yBottom += newTextElement.size.height;
            newTextElement.setInitialPosition(yBottom);
            elements.add(newTextElement);
        }

        // Bump all elements upward so the bottom is at zero
        if (hasNew && !elements.isEmpty()) {
            float amount = elements.get(elements.size() - 1).yPosTarget;
            for (TextElement element: elements) {
                element.yPosTarget -= amount;
            }
        }

        // Set all out of bound to exit
        float space = size.height - 100 - reservedBottom;
        for (TextElement element: elements) {
            if (-element.yPos > space) {
                element.stage = PresentationStage.exiting;
            }
        }

        // Animate Vertical Position
        float factor = 1 - (float)Math.pow(1 - 0.8f, 1 / Panel.FPS);
        for (TextElement element: elements) {
            element.yPos += (element.yPosTarget - element.yPos) * factor;
        }

        // Animate Entry & Exit
        float rate = 1 / (Panel.FPS * 0.5f) ; // complete fade in 0.5 seconds
        for (TextElement element: elements) {
            // entering
            if (element.stage == PresentationStage.entering) {
                element.factor += rate;
                if (element.factor >= 1) {
                    element.factor = 1;
                    element.stage = PresentationStage.entered;
                }
            }
            // exiting
            if (element.stage == PresentationStage.exiting) {
                element.factor -= rate;
                if (element.factor <= 0) {
                    element.factor = 0;
                    element.stage = PresentationStage.exited;
                }
            }
        }

        // Remove element that have exited
        elements.removeIf(e -> e.stage == PresentationStage.exited);

        // Draw Text
        for (TextElement element: elements) {
            g2D.setColor(Main.getFillColor(element.factor));
            float drawYPos = size.height + element.yPos - reservedBottom - 50;
            g2D.drawString(element.text, 10, drawYPos);
        }
    }
}
