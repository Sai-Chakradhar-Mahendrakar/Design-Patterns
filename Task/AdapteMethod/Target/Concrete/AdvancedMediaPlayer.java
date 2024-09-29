package Target.Concrete;

import Target.MediaPlayer;
import Target.Adapter.MediaAdapter;

public class AdvancedMediaPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        // Play modern formats
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing MP4 file: " + filename);
        }
        // Play legacy format using MediaAdapter
        else if (audioType.equalsIgnoreCase("wav")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media type: " + audioType + ". Supported formats: MP3, MP4, WAV");
        }
    }
    
}
