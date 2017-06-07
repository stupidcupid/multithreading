package com.multithreading.pc25;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {

    public static void main(String[] args) {

        AddCountThread service = new AddCountThread();

        Thread thread1 = new Thread(service);
        thread1.start();

        Thread thread2 = new Thread(service);
        thread2.start();

        Thread thread3 = new Thread(service);
        thread3.start();

        Thread thread4 = new Thread(service);
        thread4.start();

        Thread thread5 = new Thread(service);
        thread5.start();

    }
}
