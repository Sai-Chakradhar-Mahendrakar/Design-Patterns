// Abstract Class or Interface
interface Animal {
    void makeSound();
}

// Concrete Class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Null Object Class
class NullAnimal implements Animal {
    public void makeSound() {
        // Do nothing
    }
}

// Class that uses the Animal object
public class NullObject {
    public static void interactWithAnimal(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal nullAnimal = new NullAnimal();

        interactWithAnimal(dog);        // Outputs: Woof!
        interactWithAnimal(nullAnimal); // Outputs nothing, no need for null check
    }
}
