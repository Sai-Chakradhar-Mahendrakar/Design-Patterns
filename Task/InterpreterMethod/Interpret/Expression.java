package Interpret;

import Context.Context;

public interface Expression {
    int interpret(Context context);
}
