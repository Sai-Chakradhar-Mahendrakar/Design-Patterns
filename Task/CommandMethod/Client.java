import Invoker.CommandManager;
import Receiver.TextEditor;
import Command.Command;
import Command.ConcreteCommand.WriteTextCommand;
import Command.ConcreteCommand.DeleteTextCommand;

public class Client {
    public static void main(String args[]){

        // Receiver
        TextEditor editor = new TextEditor();

        // invoker
        CommandManager manager = new CommandManager();

        // Execute Write Command
        Command writeCommand1 = new WriteTextCommand(editor, "Hello ");
        manager.executeCommand(writeCommand1);
        System.out.println("After Writing: "+ editor);

        // Execute Write Command
        Command writeCommand2 = new WriteTextCommand(editor, "World! ");
        manager.executeCommand(writeCommand2);
        System.out.println("After Writing: "+ editor);

        // Execute Delete Command
        Command deleteCommand = new DeleteTextCommand(editor, 6);
        manager.executeCommand(deleteCommand);
        System.out.println("After Deleting: "+ editor);

        // undo last Command (Delete)
        manager.undo();
        System.out.println("After Undo: "+ editor);

        // Redo last Command (Delete)
        manager.redo();
        System.out.println("After Redo: "+ editor);

        // Undo last command (redo of delete)
        manager.undo();
        System.out.println("After undo: " + editor);
    }
}
