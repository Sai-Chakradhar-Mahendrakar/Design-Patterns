package Abstraction.ConcreteShape;

import Abstraction.Shape;
import Implementor.Renderer;

public class Circle extends Shape{

    private float radius;

    public Circle(float radius, Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
    
}
