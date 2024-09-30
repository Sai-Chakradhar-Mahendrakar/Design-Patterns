package Facade;

import SubSystem.DVDPlayer;
import SubSystem.Projector;
import SubSystem.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, SoundSystem soundSystem, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play();
    }
    
    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }
}
