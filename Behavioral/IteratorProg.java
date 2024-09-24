import java.util.ArrayList;
import java.util.List;

// Iterator Interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Concrete Iterator for a List
class ListIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int position = 0;

    public ListIterator(List<T> collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return position < collection.size();
    }

    public T next() {
        return collection.get(position++);
    }
}

// Aggregate Interface
interface IterableCollection<T> {
    Iterator<T> createIterator();
}

// Concrete Aggregate
class MyCollection<T> implements IterableCollection<T> {
    private List<T> collection = new ArrayList<>();

    public void add(T item) {
        collection.add(item);
    }

    public Iterator<T> createIterator() {
        return new ListIterator<>(collection);
    }
}

public class IteratorProg {
    public static void main(String[] args) {
        MyCollection<Integer> numbers = new MyCollection<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Iterator<Integer> it = numbers.createIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
