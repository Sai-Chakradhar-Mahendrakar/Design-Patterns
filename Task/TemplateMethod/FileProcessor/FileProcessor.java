package FileProcessor;

public abstract class FileProcessor {
    
    // Template method
    public final void processFile(){
        openFile();
        if(validateFile()){
            readFile();
            processContents();
            saveFile();
        }
        closeFile();
    }

    // Common Steps
    private void openFile(){
        System.out.println("Opening the file");
    }

    private void closeFile(){
        System.out.println("Closing the file");
    }

    private void saveFile(){
        System.out.println("Saving the processed file");
    }

    protected boolean validateFile(){
        System.out.println("Validating the file");
        return true;
    }

    // Abstract methods
    protected abstract void readFile();

    protected abstract void processContents();
}
