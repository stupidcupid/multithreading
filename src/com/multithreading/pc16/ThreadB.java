package com.multithreading.pc16;


/**
 * Created by nanzhou on 2017/6/5.
 */
public class ThreadB extends  Thread{


    private MyProject object;

    public ThreadB( MyProject object){

        super();
        this.object = object;
    }

    @Override
    public void run(){

        super.run();
        object.speedPrintString();
    }
}
