package Component.Decorator.ConcreteDecorator;

import Component.Coffee;
import Component.Decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5; // Additional cost for milk
    }
    
}
