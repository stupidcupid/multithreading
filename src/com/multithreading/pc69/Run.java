package com.multithreading.pc69;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class Run {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}

