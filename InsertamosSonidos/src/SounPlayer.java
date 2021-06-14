
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SounPlayer {

    public static void play(String soundFile) {
        try {
            InputStream in = new FileInputStream(soundFile);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            System.out.println("Error con el player");
        }
    }
}
