package com.multithreading.pc33;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock){

        super();
        this.lock = lock;

    }

    @Override
    public void run(){

        synchronized (lock){

            lock.notifyAll();

        }
    }
}
