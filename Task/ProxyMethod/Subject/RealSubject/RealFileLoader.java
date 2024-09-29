package Subject.RealSubject;

import Subject.FileLoader;

public class RealFileLoader implements FileLoader{
    private String filename;

    public RealFileLoader(String filename){
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading file from disk: " + filename);
    }

    @Override
    public void loadFile(String filename) {
        System.out.println("File '" + filename + "' is ready to be used.");
    }
}
