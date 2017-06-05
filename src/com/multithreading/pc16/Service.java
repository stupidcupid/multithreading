package com.multithreading.pc16;

/**
 * Created by nanzhou on 2017/6/5.
 */
public class Service {

    public void testMethod(MyProject object) {
        synchronized (object) {

            try {
                System.out.println("testMethod_1 ____getLock time " +
                        System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod_1 release time " +
                        System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
