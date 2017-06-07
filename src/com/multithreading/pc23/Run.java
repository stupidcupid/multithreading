package com.multithreading.pc23;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {

    public static void main(String[] args) {

        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
