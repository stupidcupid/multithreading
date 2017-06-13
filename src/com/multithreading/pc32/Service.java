package com.multithreading.pc32;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Service {

    public void testMethod(Object lock){

        try {
            synchronized (lock){

                System.out.println("wait begin");
                lock.wait();
                System.out.println("wait end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(" exception wait status thread had interruput ");
        }
    }
}
