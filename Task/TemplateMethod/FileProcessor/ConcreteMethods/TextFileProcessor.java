package FileProcessor.ConcreteMethods;

import FileProcessor.FileProcessor;

public class TextFileProcessor extends FileProcessor{

    @Override
    protected void readFile() {
        System.out.println("Reading data from a text file.");
    }

    @Override
    protected void processContents() {
       System.out.println("Processing the text file content.");
    }
}
