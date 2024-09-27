import Aggregator.ListCollection;
import Aggregator.SetCollection;
import Iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        // ListCollection 
        ListCollection<String> listCollection = new ListCollection<>();
        listCollection.add("Element 1");
        listCollection.add("Element 2");
        listCollection.add("Element 3");

        Iterator<String> listIterator = listCollection.createIterator();
        System.out.println("Iterating through ListCollection:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        listIterator.reset();
        System.out.println("\nAfter resetting, current element: " + listIterator.current());

        // SetCollection
        SetCollection<Integer> setCollection = new SetCollection<>();
        setCollection.add(100);
        setCollection.add(200);
        setCollection.add(300);

        Iterator<Integer> setIterator = setCollection.createIterator();
        System.out.println("\nIterating through SetCollection:");
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        setIterator.reset();
        System.out.println("\nAfter resetting, current element: " + setIterator.current());
    }
}
