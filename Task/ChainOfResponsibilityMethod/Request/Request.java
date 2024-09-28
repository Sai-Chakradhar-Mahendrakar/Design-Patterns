package Request;

public class Request {

    public enum RequestType {
        GENERAL, TECHNICAL, URGENT
    }

    private RequestType type;
    private String message;

    public Request(RequestType type, String message) {
        this.type = type;
        this.message = message;
    }

    public RequestType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
