package Handler.ConcreteHandler;

import Handler.Handler;
import Request.Request;

public class Level1Support extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.GENERAL) {
            System.out.println("Level 1 Support: Handling general request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Level 1 Support: Unable to handle request - " + request.getMessage());
        }
    }
}
