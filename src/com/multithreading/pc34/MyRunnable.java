package com.multithreading.pc34;

import com.multithreading.pc5.Run;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class MyRunnable {

    static private Object lock = new Object();

    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {

            try {
                synchronized (lock) {
                    System.out.println("wait begin time " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end time " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };


    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {

            synchronized (lock) {
                System.out.println("notify begin time " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end time " + System.currentTimeMillis());
            }

        }
    };

    /**
     * wait
     *
     * @param args
     */
    public static void main(String[] args) throws  InterruptedException {
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread.sleep(3000);
        Thread thread2 = new Thread(runnable2);
        thread2.start();

    }
}
