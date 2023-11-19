import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class Panel extends JPanel implements Runnable, KeyListener {

    public static float FPS = 60;
    private boolean shouldRun = true;
    private Thread drawingThread = new Thread(this);
    private Stage stage = new Stage();

    public Panel() {
        drawingThread.start();
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void run() {
        while (shouldRun) {
            repaint();
            try {
                TimeUnit.NANOSECONDS.sleep(1_000_000_000 / (long)FPS);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                return;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case '\n':
                stage.chooseSkip();
                break;
            case '1':
                stage.choose(0);
                break;
            case '2':
                stage.choose(1);
                break;
            case '3':
                stage.choose(2);
                break;
            case '4':
                stage.choose(3);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        stage.drawStage(g, getSize());
    }
}