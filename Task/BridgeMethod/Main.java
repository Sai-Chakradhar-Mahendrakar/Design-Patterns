import Abstraction.Shape;
import Implementor.Renderer;
import Abstraction.ConcreteShape.Circle;
import Abstraction.ConcreteShape.Square;
import Implementor.ConcreteRenderer.RasterRenderer;
import Implementor.ConcreteRenderer.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Shape circle = new Circle(5, vectorRenderer);
        circle.draw();

        Renderer rasterRenderer = new RasterRenderer();
        Shape square = new Square(4, rasterRenderer);
        square.draw();

        circle = new Circle(3, rasterRenderer);
        circle.draw();
    }
}
