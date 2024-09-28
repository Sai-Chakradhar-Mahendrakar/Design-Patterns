package Handler.ConcreteHandler;

import Handler.Handler;
import Request.Request;

public class Level2Support extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.TECHNICAL) {
            System.out.println("Level 2 Support: Handling technical request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Level 2 Support: Unable to handle request - " + request.getMessage());
        }
    }
}
