// Strategy Interface
interface Strategy {
    void execute();
}

// Concrete Strategy A
class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy A");
    }
}

// Concrete Strategy B
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy B");
    }
}

// Context
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

public class StrategyProg {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();  // Outputs: Executing Strategy A

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();  // Outputs: Executing Strategy B
    }
}
