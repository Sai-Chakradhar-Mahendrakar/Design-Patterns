package Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private String logFilePath;
    private boolean logToFile;

    // Private Constructor to prevent instantiation
    private Logger(){
        logFilePath="log.txt";
        logToFile=false; // Default logging the console
    }

    // Implement of Thread-Safe Singleton
    // Double Locking 
    public static Logger getInstance(){
        if(instance==null){
            synchronized(Logger.class){
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Logging methods
    public void logInfo(String message) {
        log("INFO", message);
    }

    public void logError(String message) {
        log("ERROR", message);
    }

    public void logWarning(String message) {
        log("WARNING", message);
    }

    // Helper method to log messages
    private void log(String level, String message) {
        String logMessage = String.format("[%s] %s: %s", LocalDateTime.now(), level, message);
        if (logToFile) {
            writeToFile(logMessage);
        } else {
            System.out.println(logMessage);
        }
    }

    // Method to switch between console and file logging
    public void setLogToFile(boolean logToFile){
        this.logToFile = logToFile;
    }

    // Write log to file
    private void writeToFile(String message){
        try (FileWriter fw = new FileWriter(logFilePath, true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Failed to write log to file");
        }
    }

    // Prevent Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    // Serialization-safe Singleton
    protected Object readResolve(){
        return getInstance();
    }
}
