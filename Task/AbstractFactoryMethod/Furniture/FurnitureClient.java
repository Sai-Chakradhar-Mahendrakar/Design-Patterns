import Chair.Chair;
import Factory.FurnitureFactory;
import Factory.ModernFurnitureFactory;
import Factory.VictorianFurnitureFactory;
import Sofa.Sofa;

public class FurnitureClient {
    private Chair chair;
    private Sofa sofa;

    public FurnitureClient(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void useFurniture(){
        chair.sitOn();
        sofa.lieOn();
    }

    public static void main(String args[]){
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureClient victorainClient = new FurnitureClient(victorianFactory);
        victorainClient.useFurniture();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureClient modernClient = new FurnitureClient(modernFactory);
        modernClient.useFurniture();
    }
}
