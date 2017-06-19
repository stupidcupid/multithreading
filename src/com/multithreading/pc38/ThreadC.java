package com.multithreading.pc38;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class ThreadC extends Thread{

    private C c;

    public ThreadC(C c){

        super();
        this.c = c;
    }

    @Override
    public void run(){

        while(true){

            c.getValue();
        }
    }
}
