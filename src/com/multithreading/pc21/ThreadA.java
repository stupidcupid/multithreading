package com.multithreading.pc21;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class ThreadA extends  Thread{

    private MyService myService;

    public ThreadA(MyService myService){

        super();
        this.myService = myService;
    }

    @Override
    public void run(){

        super.run();
        myService.testMethod();
    }
}
