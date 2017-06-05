package com.multithreading.pc11;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class ThreadB extends Thread{

    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {

        super();
        this.objectService = objectService;

    }

    @Override
    public void run() {

        super.run();
        objectService.serviceMethodB();
    }
}
