package com.multithreading.pc48;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class RunFirst {

    public static void main(String[] args) {

        ThreadB b = new ThreadB();

        ThreadA a = new ThreadA(b);

        a.start();
        b.start();
        System.out.println("main end" + System.currentTimeMillis());
    }
}
