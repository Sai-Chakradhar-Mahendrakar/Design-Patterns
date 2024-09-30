import Component.Coffee;
import Component.ConcreteComponent.SimpleCoffee;
import Component.Decorator.ConcreteDecorator.MilkDecorator;
import Component.Decorator.ConcreteDecorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        // simple Coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " Cost: Rs." + simpleCoffee.cost());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " Cost: Rs." + milkCoffee.cost());

        // Add sugar and milk to the coffee
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " Cost: Rs." + milkSugarCoffee.cost());
    }
}
