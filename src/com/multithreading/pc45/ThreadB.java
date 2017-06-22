package com.multithreading.pc45;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadB extends Thread {


    @Override
    public void run(){

        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println(" run end ");
        } catch (InterruptedException e) {
            System.out.println("catch exception");
            e.printStackTrace();
        }
    }
}
