package Observer;

public interface Subscriber {
    void update(String category, String newsTitle, String newsContent);
    String getName();
}
