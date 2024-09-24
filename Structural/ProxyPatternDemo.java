package JAVA.Structural;

// Subject Interface
interface Image {
    void display();
}

// RealSubject (Heavy object)
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Lazy initialization: Load the image only when it is actually needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// Client Code
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("high_res_photo1.jpg");
        Image image2 = new ProxyImage("high_res_photo2.jpg");

        // Image will be loaded from disk only when display is called
        image1.display(); // Loads and then displays the image
        System.out.println();
        image1.display(); // No loading, directly displays the image

        System.out.println();
        image2.display(); // Loads and then displays the second image
    }
}
