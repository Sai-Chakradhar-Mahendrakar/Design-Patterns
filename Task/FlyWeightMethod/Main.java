import Context.CharacterContext;
import FlyWeight.CharacterFlyWeight;
import FlyWeight.Factory.CharacterFlyWeightFactory;

public class Main {
    public static void main(String[] args) {
        CharacterFlyWeightFactory factory = new CharacterFlyWeightFactory();

        // Get flyweight characters and apply different extrinsic state
        CharacterFlyWeight characterA = factory.getFlyweight('A');
        characterA.display(new CharacterContext(10, 20, "Arial", 12));
        
        CharacterFlyWeight characterB = factory.getFlyweight('B');
        characterB.display(new CharacterContext(15, 25, "Courier", 14));
        
        // Reuse the character A flyweight
        characterA = factory.getFlyweight('A');
        characterA.display(new CharacterContext(30, 35, "Times New Roman", 16));
    }
}
