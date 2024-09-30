package Component.Decorator;

import Component.Coffee;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratorCoffee = coffee;
    }

    @Override
    public String getDescription(){
        return decoratorCoffee.getDescription();
    }

    @Override
    public double cost(){
        return decoratorCoffee.cost();
    }
}
