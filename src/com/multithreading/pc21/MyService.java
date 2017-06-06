package com.multithreading.pc21;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class MyService {

    private String lock = "123";

    public void testMethod(){

        try {
            synchronized (lock){

                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
