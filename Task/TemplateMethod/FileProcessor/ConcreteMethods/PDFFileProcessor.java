package FileProcessor.ConcreteMethods;

import FileProcessor.FileProcessor;

public class PDFFileProcessor extends FileProcessor{

    @Override
    protected void readFile() {
        System.out.println("Reading data from a PDF file.");
    }

    @Override
    protected void processContents() {
        System.out.println("Processing the PDF file content.");
    }

    protected boolean validateFile() {
        System.out.println("Validating PDF file structure.");
        return true; 
    }
}
