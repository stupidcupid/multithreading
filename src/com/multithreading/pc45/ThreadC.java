package com.multithreading.pc45;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {

        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {

        threadB.interrupt();
    }

}
