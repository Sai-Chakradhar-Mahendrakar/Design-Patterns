interface State {
    void publish(Document doc);
}

class DraftState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is in Draft state. Moving to Moderation.");
        doc.setState(new ModerationState());
    }
}

class ModerationState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is in Moderation state. Moving to Published.");
        doc.setState(new PublishedState());
    }
}

class PublishedState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is already Published. No further state changes.");
    }
}

class Document {
    private State state;

    public Document() {
        this.state = new DraftState();  // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);  // Delegates to the current state's publish method
    }
}

public class StatePatternDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        
        // Publishing the document will move it through states
        doc.publish();  // Draft -> Moderation
        doc.publish();  // Moderation -> Published
        doc.publish();  // Already Published
    }
}

