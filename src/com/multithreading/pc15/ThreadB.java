package com.multithreading.pc15;

/**
 * Created by nanzhou on 2017/6/5.
 */
public class ThreadB extends  Thread{


    private Service service;

    private Myproject object;

    public ThreadB(Service service,Myproject object){

        super();
        this.service = service;
        this.object = object;
    }

    public void run(){

        super.run();
        service.testMethod1(object);
    }
}
