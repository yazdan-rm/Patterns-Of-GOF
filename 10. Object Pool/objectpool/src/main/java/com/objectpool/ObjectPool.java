package com.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool <T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, Integer count) {
        availablePool = new LinkedBlockingDeque<>();
        for(int i = 0; i < count; i++) {
            availablePool.add(creator.get());
        }
    }

    public T get(){
        try{
            return availablePool.take();

        } catch (InterruptedException e) {
            System.err.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        try{
            obj.reset();
            availablePool.put(obj);
        }catch (InterruptedException e){
            System.err.println("put() was interrupted");
        }
    }
}
