package Abstraction.ConcreteShape;

import Abstraction.Shape;
import Implementor.Renderer;

public class Square extends Shape{
    private float side;

    public Square(float side, Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
    
}
