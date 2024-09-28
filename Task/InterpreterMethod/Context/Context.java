package Context;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variableMap = new HashMap<>();

    public void setValue(String variable, int value){
        variableMap.put(variable, value);
    }

    public int getValue(String variable){
        return variableMap.getOrDefault(variable, 0);
    }

}
