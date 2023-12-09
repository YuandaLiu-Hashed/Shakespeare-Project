import javax.swing.text.html.CSS;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
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
        ArrayList<TextLayout> layouts = new ArrayList<>();
        float height = 0;

        TextElement(String text, Font font, float wrappingWidth, FontRenderContext context) {
            AttributedString styledText = new AttributedString(text);
            styledText.addAttribute(TextAttribute.FONT, font);
            AttributedCharacterIterator itr = styledText.getIterator();
            int endIndex = itr.getEndIndex();

            LineBreakMeasurer measurer = new LineBreakMeasurer(itr, context);
            while (measurer.getPosition() < endIndex) {
                TextLayout layout = measurer.nextLayout(wrappingWidth);
                layouts.add(layout);
                height += layout.getAscent() + layout.getDescent() + layout.getLeading();
            }
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
        float stageLeftBound = (float)(size.width - Main.widthLimit) / 2;

        Font font = Main.firstFolioFont.deriveFont(28.0f);
        g2D.setFont(font);

        FontRenderContext context = g2D.getFontRenderContext();

        // Place all new elements to the bottom of the existing elements
        float yBottom = 0;
        boolean hasNew = false;
        while (!pendingEvents.isEmpty()) {
            hasNew = true;
            AddTextGameEvent event = pendingEvents.removeFirst();
            TextElement newTextElement = new TextElement(event.text, font, Main.widthLimit - 20, context);
            yBottom += newTextElement.height;
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
            float drawYPos = size.height + element.yPos - element.height - reservedBottom - 50;
            for (TextLayout layout: element.layouts) {
                drawYPos += layout.getAscent();
                layout.draw(g2D, stageLeftBound + 10, drawYPos);
                drawYPos += layout.getDescent() + layout.getLeading();
            }
        }
    }
}
