package com.multithreading.pc47;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadC extends  Thread {

    private ThreadB b;

    public ThreadC(ThreadB b){

        super();
        this.b= b;
    }

    @Override
    public void run(){

        b.bService();
    }
}
