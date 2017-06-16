package com.multithreading.pc38;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p){

        super();
        this.p = p;
    }

    @Override
    public void run(){

        super.run();
        p.setValue();
    }
}
