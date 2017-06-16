package com.multithreading.pc36;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class ThreadAdd extends Thread {

    private Add p ;

    public ThreadAdd(Add p){

        super();
        this.p = p;
    }

    @Override
    public void run(){

        super.run();
        p.add();

    }

}
