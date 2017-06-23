package com.multithreading.pc50;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
