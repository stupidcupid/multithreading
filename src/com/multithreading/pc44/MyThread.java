package com.multithreading.pc44;

/**
 * Created by nanzhou on 2017/6/21.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            int secondValue = (int) (Math.random() * 1000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
