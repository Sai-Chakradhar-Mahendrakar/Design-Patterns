package Obseverable.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import Observer.Subscriber;
import Obseverable.NewsPublisher;

public class CategoryNewsPublisher implements NewsPublisher{
    private String category;
    private List<Subscriber> subscribers;

    public CategoryNewsPublisher(String category) {
        this.category = category;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed to " + category + " news.");
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed from " + category + " news.");
    }

    @Override
    public void notifySubscribers(String newsTitle, String newsContent) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(category, newsTitle, newsContent);
        }
    }

    // Method to publish news
    public void publishNews(String newsTitle, String newsContent) {
        System.out.println("\nNew " + category + " news published!");
        notifySubscribers(newsTitle, newsContent);
    }
    
}
