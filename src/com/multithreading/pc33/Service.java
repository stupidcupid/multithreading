package com.multithreading.pc33;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Service {


    public void testMethod(Object lock) {

        try {
            synchronized (lock) {
                System.out.println(" begin lock " + Thread.currentThread().getName());
                lock.wait();
                System.out.println(" end lock " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
