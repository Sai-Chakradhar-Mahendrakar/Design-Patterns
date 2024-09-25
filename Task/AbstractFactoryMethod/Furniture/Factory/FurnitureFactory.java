package Factory;

import Chair.Chair;
import Sofa.Sofa;

/**
 * FurnitureFactory
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
