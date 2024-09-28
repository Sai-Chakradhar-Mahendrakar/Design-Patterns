package Interpret.TerminalExpression;

import Context.Context;
import Interpret.Expression;

public class NumberExpression implements Expression{
    private int number;

    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
    
}
