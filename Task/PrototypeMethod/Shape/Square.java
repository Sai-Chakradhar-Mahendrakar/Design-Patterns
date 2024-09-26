package Shape;

public class Square implements Shape{
    private int side;

    public Square(int side){
        this.side= side;
    }

    //Clone Method
    @Override
    public Shape clone(){
        return new Square(this.side);
    }

    @Override
    public void draw() {
       System.out.println("Drawing a Square");
    }
    
}
