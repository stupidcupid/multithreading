package com.multithreading.pc73;

/**
 * Created by nanzhou on 2017/6/30.
 */
public class Run {

    public static void main(String[] args) {

        Object lock = new Object();

        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 3);
        MyThread d = new MyThread(lock, "D", 0);

        a.start();
        b.start();
        c.start();
        d.start();

    }
}
