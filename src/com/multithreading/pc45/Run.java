package com.multithreading.pc45;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {

    //在Join过程中 如果当前线程对象被中断 则会抛出异常
    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
