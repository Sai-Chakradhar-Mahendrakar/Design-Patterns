package Interpret.NonTerminalExpression;

import Context.Context;
import Interpret.Expression;

public class DivideExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public DivideExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        int rightValue = rightExpression.interpret(context);
        if (rightValue == 0) {
            throw new ArithmeticException("Error: Division by zero");
        }
        return leftExpression.interpret(context) / rightValue;
    }
}
