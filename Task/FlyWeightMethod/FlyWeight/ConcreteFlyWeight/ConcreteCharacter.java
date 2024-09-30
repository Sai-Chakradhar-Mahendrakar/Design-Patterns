package FlyWeight.ConcreteFlyWeight;

import FlyWeight.CharacterFlyWeight;
import Context.CharacterContext;

public class ConcreteCharacter implements CharacterFlyWeight{
    private char intrinsicState;

    public ConcreteCharacter(char intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void display(CharacterContext context) {
        System.out.println("Character: " + intrinsicState +
                           ", Font: " + context.getFont() +
                           ", Size: " + context.getSize() +
                           ", Position: (" + context.getX() + ", " + context.getY() + ")");
    }
    
}
