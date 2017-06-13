package com.multithreading.pc33;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class ThreadC extends  Thread{

    private Object lock;

    public ThreadC(Object lock) {

        super();
        this.lock = lock;
    }

    @Override
    public void run(){

        Service service = new Service();
        service.testMethod(lock);

    }
}
