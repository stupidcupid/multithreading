package com.multithreading.pc56;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class ThreadA extends Thread {

    private Myservice myservice;

    public ThreadA(Myservice myservice) {

        super();
        this.myservice = myservice;
    }

    @Override
    public void run() {

        for (; ; ) {

            myservice.set();
        }
    }
}
