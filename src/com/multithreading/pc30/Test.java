package com.multithreading.pc30;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class Test {

    public static void main(String[] args) {

        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
