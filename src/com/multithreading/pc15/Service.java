package com.multithreading.pc15;

/**
 * Created by nanzhou on 2017/6/5.
 */
public class Service {

    public void testMethod1(Myproject object) {
        synchronized (object) {

            try {
                System.out.println("testMethod1 ____getLock time " +
                        System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 release time " +
                        System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
