package JAVA.Task.FactoryMethod;

/*
 * Create objects without specifying the exact class of the object to be created.
 */


// Product Interface
public interface Shape{
    void draw();
}

// Concrete Methods
public class Rectangle implements Shape{
    @Override 
    void draw(){
        System.out.println("Drawing the Rectangle");
    }
}

public class Main {
    
}
