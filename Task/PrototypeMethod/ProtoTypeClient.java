/*
 * Create a Shape interface with a clone method.
 * Implement two classes, Circle and Rectangle, 
    that extend Shape and support cloning.
 * You should be able to clone objects of these shapes without 
    knowing their concrete types.
 */

import Shape.Circle;
import Shape.Shape;
import Shape.Square;

public class ProtoTypeClient {
    public static void main(String arg[]){
      // Creating Instance
      Circle orgCircle = new Circle(10);
      Square orgSquare = new Square(10);

      // Cloning 
      Shape cloneCircle = orgCircle.clone();
      Shape cloneSquare = orgSquare.clone();

       // Display the shapes
       orgCircle.draw();
       cloneCircle.draw();

       orgSquare.draw();
       cloneSquare.draw();
    }
}
