public // Step 1: Define the Expression interface (Abstract Expression)
interface Expression {
    int interpret();
}

// Step 2: Create Terminal Expressions (for Numbers)
class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

// Step 3: Create Non-terminal Expressions (for Addition and Subtraction)
class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Add(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}

class Subtract implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Subtract(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}

// Step 4: Context to interpret the expressions
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        // (2 + 3) - 1
        Expression number1 = new Number(2);
        Expression number2 = new Number(3);
        Expression number3 = new Number(1);

        // Add expression (2 + 3)
        Expression addition = new Add(number1, number2);

        // Subtract expression ((2 + 3) - 1)
        Expression subtraction = new Subtract(addition, number3);

        // Interpret the expression
        System.out.println("Result: " + subtraction.interpret()); // Output: 4
    }
}
 {
    
}
