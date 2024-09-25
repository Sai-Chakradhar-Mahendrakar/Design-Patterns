package Factory;

import Chair.Chair;
import Chair.ModernChair;
import Sofa.ModernSofa;
import Sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
       return new ModernSofa();
    }
    
}
