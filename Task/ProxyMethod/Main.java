import Subject.FileLoader;
import Subject.Proxy.FileLoaderProxy;

public class Main {
    public static void main(String[] args) {
        // Admin 
        FileLoader adminProxy = new FileLoaderProxy("large_file.txt", "admin");
        adminProxy.loadFile("large_file.txt");

        System.out.println();


        // Non-admin
        FileLoader userProxy = new FileLoaderProxy("large_file.txt", "guest");
        userProxy.loadFile("large_file.txt");
    }
}
