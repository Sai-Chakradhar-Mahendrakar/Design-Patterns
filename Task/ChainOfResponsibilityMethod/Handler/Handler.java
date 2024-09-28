package Handler;

import Request.Request;

public abstract class Handler {
    protected Handler nextHandler;

    // Method to set the next handler in the chain
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Abstract method to handle the request
    public abstract void handleRequest(Request request);
}
