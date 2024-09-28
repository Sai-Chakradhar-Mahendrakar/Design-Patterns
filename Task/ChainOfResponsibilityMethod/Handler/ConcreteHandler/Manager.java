package Handler.ConcreteHandler;

import Handler.Handler;
import Request.Request;

public class Manager extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.URGENT) {
            System.out.println("Manager: Handling urgent request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Manager: Unable to handle request - " + request.getMessage());
        }
    }
}
