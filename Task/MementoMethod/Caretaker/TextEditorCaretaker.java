package Caretaker;

import java.util.Stack;

import Memento.Memento;
import Originator.TextEditor;

public class TextEditorCaretaker {
    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor editor){
        history.push(editor.save());
        System.out.println("State saved: " + editor.getText());
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            Memento memento = history.pop();
            editor.restore(memento);
            System.out.println("Undo performed. Restored text: " + editor.getText());
        } 
        else{
            System.out.println("No states to undo.");
        }
    }
}
