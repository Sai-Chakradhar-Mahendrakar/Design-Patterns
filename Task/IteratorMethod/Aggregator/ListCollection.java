package Aggregator;

import Iterator.Iterator;
import Iterator.ConcreteIterator.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class ListCollection<T> implements Collection<T>{
    private List<T> list;

    public ListCollection(){
        this.list = new ArrayList<>();
    }

    public void add(T element){
        list.add(element);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(list);   
    }
}
