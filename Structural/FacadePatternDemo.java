package JAVA.Structural;

// Subsystem: DVD Player
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD Player");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

// Subsystem: Amplifier
class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }
}

// Subsystem: Projector
class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void wideScreenMode() {
        System.out.println("Setting projector to wide screen mode");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

// Subsystem: Lights
class TheaterLights {
    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%");
    }

    public void on() {
        System.out.println("Lights are ON");
    }
}

// Facade: Home Theater Facade
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;
    private TheaterLights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Amplifier amp, Projector proj, TheaterLights lights) {
        this.dvdPlayer = dvd;
        this.amplifier = amp;
        this.projector = proj;
        this.lights = lights;
    }

    // Method to simplify the start of the movie experience
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    // Method to simplify turning everything off
    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.on();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        // Creating subsystems
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();

        // Creating the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, projector, lights);

        // Using the facade to simplify operations
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
