import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import java.util.ArrayList;

public class AudioPresenter {
    ArrayList<Clip> playingClips = new ArrayList<>();

    void playClip(String fileName) {
        Clip clip = Main.audioClips.get(fileName);
        if (clip == null) {
            System.out.println("ERROR: file " + fileName + "doesn't exist");
            return;
        }
        clip.setFramePosition(0);
        clip.start();
        playingClips.add(clip);
    }

    boolean finishedPlaying() {
        return playingClips.isEmpty();
    }

    void update() {
        playingClips.removeIf(c -> !c.isActive());
    }
}
