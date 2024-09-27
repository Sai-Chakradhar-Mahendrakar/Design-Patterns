package Aggregator;

import java.util.HashSet;
import java.util.Set;

import Iterator.Iterator;
import Iterator.ConcreteIterator.SetIterator;

public class SetCollection<T> implements Collection<T>{
    private Set<T> set;

    public SetCollection(){
        this.set = new HashSet<>();
    }

    public void add(T element){
        set.add(element);
    }

    @Override
    public Iterator<T> createIterator() {
        return new SetIterator<>(set);
    }
    
}
