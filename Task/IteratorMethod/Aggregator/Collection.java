package Aggregator;

import Iterator.Iterator;

public interface Collection<T> {
    Iterator<T> createIterator();
}
