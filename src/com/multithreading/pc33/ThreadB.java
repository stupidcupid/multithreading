package com.multithreading.pc33;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock) {

        super();
        this.lock = lock;
    }

    @Override
    public void run(){

        Service service = new Service();
        service.testMethod(lock);

    }
}
