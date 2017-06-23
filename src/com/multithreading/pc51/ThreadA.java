package com.multithreading.pc51;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class ThreadA extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("ThreadA getValue " + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
