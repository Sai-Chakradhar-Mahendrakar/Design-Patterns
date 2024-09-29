package State;

import Context.MusicPlayer;

public interface State {
    void play(MusicPlayer player);
    void pause(MusicPlayer player);
    void stop(MusicPlayer player);
}
