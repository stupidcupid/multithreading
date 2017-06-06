package com.multithreading.pc19;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {

    /**
     * 多线程死锁  jsp  /  jstack -l pid
     */
    public static void main(String[] args) {

        try {
            DealThread dealThread = new DealThread();
            dealThread.setFlag("a");
            Thread thread1 = new Thread(dealThread);
            thread1.start();
            Thread.sleep(100);
            dealThread.setFlag("b");
            Thread thread2 = new Thread(dealThread);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
