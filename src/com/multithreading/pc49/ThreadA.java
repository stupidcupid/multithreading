package com.multithreading.pc49;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadA extends Thread {


    @Override
    public void run() {

        try {

            for (int i = 0; i < 100; i++) {

                Tools.t1.set("ThreadA" + (i + 1));
                System.out.println("ThreadA get value  " + Tools.t1.get());

                Thread.sleep(200);
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
