// Step 1: Command Interface with undo method
import java.util.Stack;

interface Command {
    void execute();
    void undo();
}

// Step 2: Concrete Command for turning on the light
class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.turnOn();
    }

    public void undo() {
        light.turnOff();
    }
}

// Step 3: Concrete Command for turning off the light
class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.turnOff();
    }

    public void undo() {
        light.turnOn();
    }
}

// Step 4: Receiver Class (Light)
class Light {
    public void turnOn() {
        System.out.println("The light is ON");
    }
    
    public void turnOff() {
        System.out.println("The light is OFF");
    }
}

// Step 5: Invoker Class (RemoteControl) with undo/redo support


class RemoteControl {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        command.execute();
        commandHistory.push(command);
        redoStack.clear();  // Clear redo stack when new command is executed
    }
    
    public void undoButton() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            redoStack.push(lastCommand);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redoButton() {
        if (!redoStack.isEmpty()) {
            Command redoCommand = redoStack.pop();
            redoCommand.execute();
            commandHistory.push(redoCommand);
        } else {
            System.out.println("Nothing to redo");
        }
    }
}

// Step 6: Client
public class CommandPatternUndoRedoDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        
        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();
        
        // Undo the last command (turn off -> turn on)
        remote.undoButton();
        
        // Redo the last undone command (turn on -> turn off)
        remote.redoButton();
    }
}
