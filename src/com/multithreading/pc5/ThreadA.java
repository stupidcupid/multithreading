package com.multithreading.pc5;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class ThreadA extends  Thread {

    private MyProject object;

    public ThreadA(MyProject object){

        super();
        this.object = object;

    }

    @Override
    public void run(){

        super.run();
        object.methodA();

    }
}
