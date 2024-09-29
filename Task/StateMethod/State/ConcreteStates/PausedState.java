package State.ConcreteStates;

import Context.MusicPlayer;
import State.State;

public class PausedState implements State{

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Resuming music.");
        player.setState(new PlayingState()); 
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Music is already Paused.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Music is now Stopped.");
        player.setState(new StoppedState());
    }
    
}
