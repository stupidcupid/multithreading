package com.multithreading.pc40;

/**
 * Created by nanzhou on 2017/6/19.
 */
public class P_Thread extends Thread {


    private P p;

    public P_Thread(P p) {

        super();
        this.p = p;
    }

    @Override
    public void run() {

        while (true) {
            p.pushService();
        }
    }
}
