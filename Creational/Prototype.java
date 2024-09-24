// Prototype Interface
abstract class Car implements Cloneable {
    protected String engine;

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public abstract void showDetails();
}

// Concrete Prototype - Sedan
class Sedan extends Car {
    private int seats;

    public Sedan(String engine, int seats) {
        this.engine = engine;
        this.seats = seats;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Sedan) super.clone();
    }

    @Override
    public void showDetails() {
        System.out.println("Sedan with engine: " + engine + ", seats: " + seats);
    }
}

// Concrete Prototype - SUV
class SUV extends Car {
    private boolean offroadCapability;

    public SUV(String engine, boolean offroadCapability) {
        this.engine = engine;
        this.offroadCapability = offroadCapability;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (SUV) super.clone();
    }

    @Override
    public void showDetails() {
        System.out.println("SUV with engine: " + engine + ", offroad capability: " + (offroadCapability ? "Yes" : "No"));
    }
}

// Client code demonstrating prototype pattern
public class Prototype {
    public static void main(String[] args) {
        try {
            // Original Sedan
            Sedan sedan = new Sedan("V6", 5);
            sedan.showDetails();

            // Cloning the Sedan
            Sedan clonedSedan = (Sedan) sedan.clone();
            clonedSedan.showDetails();

            // Original SUV
            SUV suv = new SUV("V8", true);
            suv.showDetails();

            // Cloning the SUV
            SUV clonedSUV = (SUV) suv.clone();
            clonedSUV.showDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
