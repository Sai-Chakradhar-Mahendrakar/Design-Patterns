package Interpret.TerminalExpression;

import Context.Context;
import Interpret.Expression;

public class VariableExpression implements Expression{
    private String variableName;

    public VariableExpression(String variableName){
        this.variableName = variableName;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(variableName);
    }
    
}
