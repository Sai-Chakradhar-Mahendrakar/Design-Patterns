package FlyWeight.Factory;

import java.util.HashMap;
import java.util.Map;

import FlyWeight.CharacterFlyWeight;
import FlyWeight.ConcreteFlyWeight.ConcreteCharacter;

public class CharacterFlyWeightFactory {
    private Map<Character, CharacterFlyWeight> flyweightPool = new HashMap<>();

    public CharacterFlyWeight getFlyweight(char character) {
        if (!flyweightPool.containsKey(character)) {
            flyweightPool.put(character, new ConcreteCharacter(character));
        }
        return flyweightPool.get(character);
    }
}
