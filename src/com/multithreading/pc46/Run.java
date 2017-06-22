package com.multithreading.pc46;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        ThreadB b = new ThreadB();

        ThreadA a = new ThreadA(b);
        a.start();

        Thread.sleep(2000);

        ThreadC c = new ThreadC(b);
        c.start();
    }
}
