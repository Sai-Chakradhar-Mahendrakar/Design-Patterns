package JAVA.Structural;

// Component Interface
interface Beverage {
    String getDescription();
    double cost();
}

// ConcreteComponent: Espresso
class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

// ConcreteComponent: HouseBlend
class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}

// Decorator Abstract Class
abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}

// ConcreteDecorator: Milk
class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}

// ConcreteDecorator: Sugar
class Sugar extends CondimentDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Order a plain espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Order a house blend with milk and sugar
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);  // Adding milk
        beverage2 = new Sugar(beverage2); // Adding sugar
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
