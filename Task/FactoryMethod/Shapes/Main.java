/*
 * Create objects without specifying the exact class of the object to be created.
 */
import shapes.Shape;
import shapes.ShapeFactory;

public class Main {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

        return;
    }
}