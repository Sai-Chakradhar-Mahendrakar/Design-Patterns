import Caretaker.TextEditorCaretaker;
import Originator.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        // Type text and save state
        editor.type("Hello");
        caretaker.save(editor);

        // Type more text and save state
        editor.type(" World");
        caretaker.save(editor);

        // Type more text without saving
        editor.type("!");
        System.out.println("Current text: " + editor.getText());

        // Undo to the previous saved state
        caretaker.undo(editor);

        // Undo to the initial state
        caretaker.undo(editor);

        // Try undoing when no more states exist
        caretaker.undo(editor);
    }
}
