import Facade.HomeTheaterFacade;
import SubSystem.DVDPlayer;
import SubSystem.Projector;
import SubSystem.SoundSystem;

public class Main {
    public static void main(String[] args) {
        // Create subsystems
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, soundSystem, projector);

        // Use the facade to operate the home theater
        homeTheater.watchMovie();  // Simplified interaction to watch a movie
        homeTheater.endMovie();    // Simplified interaction to end the movie
    }
}
