package com.multithreading.pc47;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {


    /**
     * join() 具有释放锁的特点
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        ThreadB b = new ThreadB();

        ThreadA a = new ThreadA(b);
        a.start();

        Thread.sleep(2000);

        ThreadC c = new ThreadC(b);
        c.start();
    }
}
