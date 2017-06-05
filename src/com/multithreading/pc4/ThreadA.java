package com.multithreading.pc4;

/**
 * Created by nanzhou on 2017/5/27.
 */
public class ThreadA extends Thread
{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){

        super();
        this.numRef = numRef;

    }
    @Override
    public void run(){

        super.run();
        numRef.addI("a");
    }
}
