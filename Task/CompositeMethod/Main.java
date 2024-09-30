import Component.Composite.Directory;
import Component.Leaf.File;

public class Main {
    public static void main(String[] args) {
        // Creating File
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");


        // Create Directory
        Directory directory1 = new Directory("Directory1");
        Directory directory2 = new Directory("Directory2");

        // Add files to directory1
        directory1.add(file1);
        directory1.add(file2);

        // Add files and directory1 to directory2
        directory2.add(file3);
        directory2.add(directory1);

        // Show the details of the entire file system
        directory2.showDetails();
        
    }
}
