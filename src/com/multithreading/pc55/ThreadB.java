package com.multithreading.pc55;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class ThreadB extends Thread {

    private Myservice myservice;

    public ThreadB(Myservice myservice){

        super();
        this.myservice = myservice;

    }

    @Override
    public void run(){

        myservice.awaitB();
    }
}
