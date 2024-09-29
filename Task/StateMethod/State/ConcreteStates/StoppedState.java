package State.ConcreteStates;

import Context.MusicPlayer;
import State.State;

public class StoppedState implements State{

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Music is now Playing.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Cannot Pause. Music is already Stopped.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Music is already Stopped.");
    }
    
}
