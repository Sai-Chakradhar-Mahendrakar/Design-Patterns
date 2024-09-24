// package JAVA.Creational;
// Product interface declares a method that all concrete products must implement
interface Product {
    void use();
}

// ConcreteProductA is a concrete implementation of the Product interface
class ConcreteProductA implements Product {
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}

// ConcreteProductB is another concrete implementation of the Product interface
class ConcreteProductB implements Product {
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}

// Creator class declares the factory method that returns a Product object
abstract class Creator {
    public abstract Product factoryMethod(); // Factory method

    public void someOperation() {
        // Uses the factory method to create a Product and then use it
        Product product = factoryMethod();
        product.use();
    }
}

// ConcreteCreatorA implements the factory method to create a ConcreteProductA
class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

// ConcreteCreatorB implements the factory method to create a ConcreteProductB
class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class Factory {
    public static void main(String[] args) {
        // Create a ConcreteCreatorA and use it to create and use a ConcreteProductA
        Creator creator = new ConcreteCreatorA();
        creator.someOperation();

        // Switch to ConcreteCreatorB to create and use a ConcreteProductB
        creator = new ConcreteCreatorB();
        creator.someOperation();
    }
}
