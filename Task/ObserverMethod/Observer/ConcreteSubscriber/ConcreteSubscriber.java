package Observer.ConcreteSubscriber;

import Observer.Subscriber;

public class ConcreteSubscriber implements Subscriber{
    private String name;

    public ConcreteSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String category, String newsTitle, String newsContent) {
        System.out.println("Notification to " + name + ": New " + category + " news");
        System.out.println("Title: " + newsTitle);
        System.out.println("Content: " + newsContent + "\n");
    }

    public String getName() {
        return name;
    }
    
}
