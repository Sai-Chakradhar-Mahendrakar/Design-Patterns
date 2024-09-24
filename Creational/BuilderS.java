// Product class
class Car {
    private String engine;
    private String seats;
    private String airbags;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setAirbags(String airbags) {
        this.airbags = airbags;
    }

    public void show() {
        System.out.println("Car with engine: " + engine + ", seats: " + seats + ", airbags: " + airbags);
    }
}

// Abstract Builder class
abstract class CarBuilder {
    protected Car car;

    public CarBuilder() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public abstract void buildEngine();
    public abstract void buildSeats();
    public abstract void buildAirbags();
}

// Concrete Builder for Sedan Car
class SedanCarBuilder extends CarBuilder {

    public void buildEngine() {
        car.setEngine("Sedan Engine");
    }

    public void buildSeats() {
        car.setSeats("5 Seats");
    }

    public void buildAirbags() {
        car.setAirbags("2 Airbags");
    }
}

// Concrete Builder for SUV Car
class SUVCarBuilder extends CarBuilder {

    public void buildEngine() {
        car.setEngine("SUV Engine");
    }

    public void buildSeats() {
        car.setSeats("7 Seats");
    }

    public void buildAirbags() {
        car.setAirbags("6 Airbags");
    }
}

// Director class to manage the building process
class Director {
    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void constructCar() {
        builder.buildEngine();
        builder.buildSeats();
        builder.buildAirbags();
    }
}

// Client code
public class BuilderS {
    public static void main(String[] args) {
        Director director = new Director();

        // Building a Sedan Car
        CarBuilder sedanBuilder = new SedanCarBuilder();
        director.setBuilder(sedanBuilder);
        director.constructCar();
        Car sedanCar = sedanBuilder.getCar();
        sedanCar.show();

        // Building an SUV Car
        CarBuilder suvBuilder = new SUVCarBuilder();
        director.setBuilder(suvBuilder);
        director.constructCar();
        Car suvCar = suvBuilder.getCar();
        suvCar.show();
    }
}
