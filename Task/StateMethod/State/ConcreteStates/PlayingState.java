package State.ConcreteStates;

import Context.MusicPlayer;
import State.State;

public class PlayingState implements State{

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Music is already playing.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Music is now Paused.");
        player.setState(new PausedState()); // Transition to Paused state
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Music is now Stopped.");
        player.setState(new StoppedState()); // Transition to Stopped state
    }
    
}
