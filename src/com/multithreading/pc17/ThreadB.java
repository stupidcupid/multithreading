package com.multithreading.pc17;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class ThreadB extends  Thread{


    private Service service ;

    public ThreadB(Service service){

        super();
        this.service = service;

    }

    @Override
    public void run(){

        service.print(new Object());
    }
}
