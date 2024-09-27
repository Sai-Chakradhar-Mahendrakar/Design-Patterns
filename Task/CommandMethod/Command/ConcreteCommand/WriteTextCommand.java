package Command.ConcreteCommand;

import Command.Command;
import Receiver.TextEditor;

public class WriteTextCommand implements Command{
    private TextEditor editor;
    private String text;

    public WriteTextCommand(TextEditor editor, String text){
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.write(text);
    }

    @Override
    public void undo() {
        editor.delete(text.length());
    } 
}
