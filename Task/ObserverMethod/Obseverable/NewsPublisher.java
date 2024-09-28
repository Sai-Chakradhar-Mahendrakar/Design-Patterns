package Obseverable;

import Observer.Subscriber;

public interface NewsPublisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String newsTitle, String newsContent);
}
