package com.multithreading.pc36;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Add {

    private String lock;

    public Add(String lock){

        super();
        this.lock = lock;
    }

    public void add(){


        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
