package com.multithreading.pc49;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class Run {

    /**
     * 线程的变量隔离性
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        for (int i = 0; i < 100; i++) {

            Tools.t1.set("Main " + (i+1));
            System.out.println("Main get value " + Tools.t1.get());
            Thread.sleep(200);
        }
    }
}
