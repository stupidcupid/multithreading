package com.multithreading.pc36;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class ThreadSubtract extends  Thread {

    private Subtract s;

    public ThreadSubtract(Subtract s){

        super();
        this.s = s;

    }

    @Override
    public void run(){

        super.run();
        s.Subtract();
    }
}
