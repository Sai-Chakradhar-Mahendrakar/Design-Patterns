import Logger.Logger;

public class LoggerTest {
    public static void main(String arg[]){
        Logger logger = Logger.getInstance();

        // Log Message to the console
        logger.logInfo("This is INFO Message");
        logger.logWarning("This is WARN Message");
        logger.logError("This is ERR Message");

        // Set Logger to log to a File
        logger.setLogToFile(true);
        logger.logInfo("This is INFO Message to a File");

        // Sinulate multi-threaded logging
        Thread thread1 = new Thread(()->{
            Logger loggerInstance = Logger.getInstance();
            loggerInstance.logInfo("Log From Thread1.");
        });

        Thread thread2 = new Thread(()->{
            Logger loggerInstance = Logger.getInstance();
            loggerInstance.logInfo("Log From Thread2.");
        });

        thread1.start();
        thread2.start();
    }
}
