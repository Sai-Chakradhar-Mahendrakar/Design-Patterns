// Abstract class
abstract class Game {
    
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // Steps of the algorithm, some defined, some abstract
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}

// Subclass 1
class Football extends Game {
    
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

// Subclass 2
class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

// Client class
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        
        System.out.println();
        
        game = new Cricket();
        game.play();
    }
}
