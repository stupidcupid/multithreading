package com.multithreading.pc48;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();

        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        b.join(2000);
        System.out.println("main end time " + System.currentTimeMillis());
    }
}
