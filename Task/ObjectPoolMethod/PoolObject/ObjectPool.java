package PoolObject;

import java.util.LinkedList;
import java.util.Queue;

public class ObjectPool<T> {
    public final Queue<T> availableObjects = new LinkedList<>();
    public final int maxSize;

    public ObjectPool(int maxSize, PoolObjectFactory<T> factory){
        this.maxSize = maxSize;
        for(int i=0;i<maxSize;i++){
            availableObjects.add(factory.createObject());
        }
    }

    // Borrow 
    public synchronized T borrowObjects() throws InterruptedException{
        while(availableObjects.isEmpty()){
            wait();
        }
        return availableObjects.poll();
    }

    // Return object to pool
    public synchronized void returnObject(T object){
        availableObjects.offer(object);
        notify();
    }
}
