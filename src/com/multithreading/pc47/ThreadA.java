package com.multithreading.pc47;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadA extends Thread {


    private ThreadB b;

    public ThreadA(ThreadB b) {

        super();
        this.b = b;
    }

    @Override
    public void run() {

        try {
            synchronized (b) {
                b.start();
                b.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
