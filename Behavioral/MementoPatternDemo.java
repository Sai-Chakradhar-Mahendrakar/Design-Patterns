// Memento: Stores the state of the Originator
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator: The object whose state is being saved/restored
class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Save the current state inside a Memento
    public Memento saveStateToMemento() {
        System.out.println("Originator: Saving state to Memento.");
        return new Memento(state);
    }

    // Restore the state from a Memento
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: State restored from Memento: " + state);
    }
}

// Caretaker: Responsible for storing and retrieving mementos
class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}

// Demo
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento()); // Save state #2

        originator.setState("State #3");
        caretaker.addMemento(originator.saveStateToMemento()); // Save state #3

        originator.setState("State #4");
        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(0)); // Restore to state #2
        originator.getStateFromMemento(caretaker.getMemento(1)); // Restore to state #3
    }
}
