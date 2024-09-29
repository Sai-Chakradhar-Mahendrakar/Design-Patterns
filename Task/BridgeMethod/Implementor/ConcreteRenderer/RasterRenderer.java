package Implementor.ConcreteRenderer;

import Implementor.Renderer;

public class RasterRenderer implements Renderer{

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with radius " + radius + " using raster graphics.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square with side " + side + " using raster graphics.");
    }
    
}
