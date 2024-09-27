package Command.ConcreteCommand;

import Command.Command;
import Receiver.TextEditor;

public class DeleteTextCommand implements Command{
    private TextEditor editor;
    private String deleteText;
    private int length;

    public DeleteTextCommand(TextEditor editor, int length){
        this.editor = editor;
        this.length = length;
    }

    @Override
    public void execute() {
        deleteText = editor.getText().substring(editor.getText().length()-length);
        editor.delete(length);
    }

    @Override
    public void undo() {
        editor.write(deleteText);
    }
}
