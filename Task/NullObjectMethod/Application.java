import Logger.ConsoleLogger;
import Logger.Logger;
import Logger.NullLogger;

public class Application {
    private Logger logger;

    public Application(Logger logger){
        this.logger=logger;
    }

    public void process(String action){
        logger.log("Action Performed: "+ action);
    }

    public static void main(String args[]){
        Application appWithConsoleLogger = new Application(new ConsoleLogger());
        appWithConsoleLogger.process("Start Process");

        // using null logger
        Application appWithNullLogger = new Application(new NullLogger());
        appWithNullLogger.process("No Logging Process");
    }
}

