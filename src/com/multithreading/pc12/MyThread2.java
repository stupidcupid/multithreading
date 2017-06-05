package com.multithreading.pc12;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class MyThread2 extends  Thread {


    private Task task;

    public MyThread2(Task task){

        super();
        this.task = task;

    }

    @Override
    public void run(){

        super.run();
        task.otherMethod();

    }
}
