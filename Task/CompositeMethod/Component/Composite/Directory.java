package Component.Composite;

import java.util.ArrayList;
import java.util.List;

import Component.FileComponent;

public class Directory implements FileComponent{
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void add(FileComponent fileComponent) {
        children.add(fileComponent);
    }
    
    public void remove(FileComponent fileComponent) {
        children.remove(fileComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileComponent component : children) {
            component.showDetails();
        }
    }
    
}
