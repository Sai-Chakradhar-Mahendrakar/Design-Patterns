import Target.Concrete.AdvancedMediaPlayer;

public class Main {
    public static void main(String[] args) {
        AdvancedMediaPlayer player = new AdvancedMediaPlayer();

        // Playing modern formats
        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");

        System.out.println();

        // Playing legacy format
        player.play("wav", "old_song.wav");

        System.out.println();

        // Trying an unsupported format
        player.play("flac", "unknown.flac");
    }
}
    