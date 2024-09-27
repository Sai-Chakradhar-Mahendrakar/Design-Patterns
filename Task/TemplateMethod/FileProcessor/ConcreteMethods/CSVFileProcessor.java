package FileProcessor.ConcreteMethods;

import FileProcessor.FileProcessor;

public class CSVFileProcessor extends FileProcessor{

    @Override
    protected void readFile() {
        System.out.println("Reading data from a CSV file.");
    }

    @Override
    protected void processContents() {
        System.out.println("Processing the CSV file content.");
    }
    
    @Override
    protected boolean validateFile() {
        System.out.println("Validating CSV file structure.");
        return true; 
    }
}
