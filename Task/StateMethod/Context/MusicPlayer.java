package Context;

import State.State;
import State.ConcreteStates.StoppedState;

public class MusicPlayer {
    private State currentState;

    public MusicPlayer(){
        this.currentState = new StoppedState();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public void play(){
        currentState.play(this);
    }

    public void pause(){
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }
}
