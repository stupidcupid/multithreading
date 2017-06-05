package com.multithreading.pc16;



/**
 * Created by nanzhou on 2017/6/5.
 */
public class ThreadA extends  Thread{

    private Service service;

    private MyProject object;

    public ThreadA(Service service, MyProject object){

        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run(){

        super.run();
       service.testMethod(object);
    }

}
