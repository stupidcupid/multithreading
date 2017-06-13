package com.multithreading.pc33;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Test {

    /**
     * notify notifyAll
      * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        ThreadB threadB = new ThreadB(lock);
        threadB.start();

        ThreadC threadC = new ThreadC(lock);
        threadC.start();

        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }
}
