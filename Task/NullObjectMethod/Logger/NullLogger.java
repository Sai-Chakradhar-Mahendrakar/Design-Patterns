package Logger;

public class NullLogger implements Logger{

    @Override
    public void log(String message) {
        // Do Nothing, as it is a null object    
    }
    
}
