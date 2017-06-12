package com.multithreading.pc27;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class ThreadB extends Thread{

    private MyList list;

    public ThreadB(MyList list){

        super();
        this.list = list;
    }
}
