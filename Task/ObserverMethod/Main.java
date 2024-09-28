import Observer.ConcreteSubscriber.ConcreteSubscriber;
import Obseverable.ConcreteSubject.CategoryNewsPublisher;
import Observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        // Create news publishers for different categories
        CategoryNewsPublisher sportsPublisher = new CategoryNewsPublisher("Sports");
        CategoryNewsPublisher techPublisher = new CategoryNewsPublisher("Technology");
        CategoryNewsPublisher politicsPublisher = new CategoryNewsPublisher("Politics");

        // Create subscribers
        Subscriber subscriber1 = new ConcreteSubscriber("Alice");
        Subscriber subscriber2 = new ConcreteSubscriber("Bob");
        Subscriber subscriber3 = new ConcreteSubscriber("Charlie");

        // Subscribing to categories
        sportsPublisher.addSubscriber(subscriber1);
        sportsPublisher.addSubscriber(subscriber3);

        techPublisher.addSubscriber(subscriber2);

        politicsPublisher.addSubscriber(subscriber3);

        // Publish news in different categories
        sportsPublisher.publishNews("Football Match", "Team A won the match by 2-0.");
        techPublisher.publishNews("New Smartphone Release", "Brand X releases its latest smartphone.");
        politicsPublisher.publishNews("Election Results", "Party Y wins the election.");

        // Unsubscribe a user
        sportsPublisher.removeSubscriber(subscriber1);

        // Publish another news after unsubscription
        sportsPublisher.publishNews("Tennis Match", "Player B wins the grand slam.");
    }
}
