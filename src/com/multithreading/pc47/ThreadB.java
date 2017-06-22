package com.multithreading.pc47;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadB extends Thread {

    @Override
    public void run() {

        try {
            System.out.println(" b run begin time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" b run end time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    synchronized public void bService() {
        System.out.println(" print bservice timer " + System.currentTimeMillis());
    }

}
