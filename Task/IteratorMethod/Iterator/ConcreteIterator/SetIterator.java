package Iterator.ConcreteIterator;

import Iterator.Iterator;
import java.util.Set;

// Concrete iterator for SetCollection
public class SetIterator<T> implements Iterator<T> {
    private Set<T> set;
    private java.util.Iterator<T> iterator; // Fully qualified name to avoid conflict with our custom Iterator
    private T current;

    public SetIterator(Set<T> set) {
        this.set = set;
        this.iterator = set.iterator();
        if (iterator.hasNext()) {
            this.current = iterator.next();
        }
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        if (iterator.hasNext()) {
            current = iterator.next();
        }
        return current;
    }

    @Override
    public void reset() {
        this.iterator = set.iterator();
        if (iterator.hasNext()) {
            current = iterator.next();
        }
    }

    @Override
    public T current() {
        return current;
    }
}
