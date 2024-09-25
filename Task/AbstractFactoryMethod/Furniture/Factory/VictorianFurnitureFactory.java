package Factory;

import Chair.Chair;
import Chair.VictorianChair;
import Sofa.Sofa;
import Sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
    
}
