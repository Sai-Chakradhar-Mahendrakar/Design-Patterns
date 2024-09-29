package Target.Adapter;

import Adaptee.OldMediaPlayer;
import Target.MediaPlayer;

public class MediaAdapter implements MediaPlayer{
    OldMediaPlayer oldMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav")) {
            oldMediaPlayer = new OldMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("wav")) {
            oldMediaPlayer.playWavFile(filename);
        }
    }
    
}
