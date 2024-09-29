package Subject.Proxy;

import Subject.FileLoader;
import Subject.RealSubject.RealFileLoader;

public class FileLoaderProxy implements FileLoader {
    private RealFileLoader realFileLoader;
    private String filename;
    private String userRole;

    public FileLoaderProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void loadFile(String filename) {
        if (!isAuthorized()) {
            System.out.println("Access denied: You do not have permission to load the file.");
            return;
        }

        if (realFileLoader == null) {
            realFileLoader = new RealFileLoader(filename); // Lazy loading
        }
        realFileLoader.loadFile(filename);
    }

    private boolean isAuthorized() {
        return userRole.equalsIgnoreCase("admin");
    }

}
