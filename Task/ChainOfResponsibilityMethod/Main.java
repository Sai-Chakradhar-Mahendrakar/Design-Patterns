import Handler.Handler;
import Handler.ConcreteHandler.Level1Support;
import Handler.ConcreteHandler.Level2Support;
import Handler.ConcreteHandler.Manager;
import Request.Request;

public class Main {
    public static void main(String[] args) {
        // Handlers
        Handler level1Support = new Level1Support();
        Handler level2Support = new Level2Support();
        Handler manager = new Manager();

        // Set up the chain
        level1Support.setNextHandler(level2Support);
        level2Support.setNextHandler(manager);

        // Create requests
        Request generalRequest = new Request(Request.RequestType.GENERAL, "Customer has a general query.");
        Request technicalRequest = new Request(Request.RequestType.TECHNICAL, "Customer has a technical issue.");
        Request urgentRequest = new Request(Request.RequestType.URGENT, "Customer needs urgent help.");

        // Process the request
        level1Support.handleRequest(generalRequest);
        level1Support.handleRequest(technicalRequest);
        level1Support.handleRequest(urgentRequest);
    }
}
