import Context.Context;
import Interpret.Expression;
import Interpret.NonTerminalExpression.AddExpression;
import Interpret.NonTerminalExpression.DivideExpression;
import Interpret.NonTerminalExpression.MultiplyExpression;
import Interpret.NonTerminalExpression.SubtractExpression;
import Interpret.TerminalExpression.NumberExpression;
import Interpret.TerminalExpression.VariableExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // variable assignment
        context.setValue("x", 10);

        // Expression: x + 5
        Expression expr1 = new AddExpression(new VariableExpression("x"), new NumberExpression(5));
        System.out.println("x + 5 = " + expr1.interpret(context)); 

        // Expression: 5 + (3 * 4) - 2
        Expression expr2 = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(5),
                        new MultiplyExpression(new NumberExpression(3), new NumberExpression(4))
                ),
                new NumberExpression(2)
        );
        System.out.println("5 + (3 * 4) - 2 = " + expr2.interpret(context)); // Output: 15

        // Division example: 10 / 2
        Expression expr3 = new DivideExpression(new NumberExpression(10), new NumberExpression(2));
        System.out.println("10 / 2 = " + expr3.interpret(context)); // Output: 5

        // Attempt to divide by zero: 10 / 0
        try {
            Expression expr4 = new DivideExpression(new NumberExpression(10), new NumberExpression(0));
            System.out.println("10 / 0 = " + expr4.interpret(context));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
