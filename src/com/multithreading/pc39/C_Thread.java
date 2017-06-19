package com.multithreading.pc39;

/**
 * Created by nanzhou on 2017/6/19.
 */
public class C_Thread extends Thread {

    private C c;

    public C_Thread(C c){

        super();
        this.c = c;
    }

    @Override
    public void run(){

        while (true){

            c.popService();
        }
    }
}
