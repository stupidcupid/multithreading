package com.multithreading.pc27;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class Test {

    public static void main(String[] args) {

        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(50);
            ThreadB threadB = new ThreadB(lock);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
