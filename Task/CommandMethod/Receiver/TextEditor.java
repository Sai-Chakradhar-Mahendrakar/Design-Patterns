package Receiver;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String newText){
        text.append(newText);
    }

    public void delete(int length){
        if(length>text.length()){
            length=text.length();
        }
        text.delete(text.length()-length, text.length());
    }

    public String getText(){
        return text.toString();
    }

    @Override
    public String toString(){
        return text.toString();
    }
}
