import FileProcessor.FileProcessor;
import FileProcessor.ConcreteMethods.CSVFileProcessor;
import FileProcessor.ConcreteMethods.PDFFileProcessor;
import FileProcessor.ConcreteMethods.TextFileProcessor;

public class Main {
    public static void main(String[] args) {
        // Creating instances
        FileProcessor textFileProcessor = new TextFileProcessor();
        FileProcessor csvFileProcessor = new CSVFileProcessor();
        FileProcessor pdfFileProcessor = new PDFFileProcessor();

        //Processing each Object
        System.out.println("Processing a Text File:");
        textFileProcessor.processFile();

        System.out.println("\nProcessing a CSV File:");
        csvFileProcessor.processFile();

        System.out.println("\nProcessing a PDF File:");
        pdfFileProcessor.processFile();
    }
}
