package Iterator.ConcreteIterator;

import java.util.List;

import Iterator.Iterator;

public class ListIterator<T> implements Iterator<T>{
    private List<T> list;
    private int position;

    public ListIterator(List<T> list){
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
       return position < list.size();
    }

    @Override
    public T next() {
        return hasNext() ? list.get(position++) : null;
    }

    @Override
    public void reset() {
        position=0;
    }

    @Override
    public T current() {
        return position < list.size() ? list.get(position) : null;
    }
}
