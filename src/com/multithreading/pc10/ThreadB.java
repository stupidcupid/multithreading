package com.multithreading.pc10;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class ThreadB extends  Thread{

    private Task task;

    public ThreadB(Task task){

        super();
        this.task = task;

    }

    @Override
    public void run(){

        super.run();
        task.doLongTimeTask();
    }
}
