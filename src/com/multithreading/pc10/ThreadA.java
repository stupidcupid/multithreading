package com.multithreading.pc10;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class ThreadA extends  Thread {

    private Task task;

    public ThreadA(Task task){

        super();
        this.task = task;

    }

    @Override
    public void run(){

        super.run();
        task.doLongTimeTask();

    }
}
