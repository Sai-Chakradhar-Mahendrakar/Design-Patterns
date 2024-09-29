package Originator;

import Memento.Memento;

public class TextEditor {
    private String text;

    public TextEditor(){
        this.text="";
    }

    public void type(String newText){
        text+=newText;
    }

    public Memento save(){
        return new Memento(text);
    }

    public void restore(Memento memento){
        text = memento.getState();
    }

    public String getText(){
        return text;
    }
}
