package com.multithreading.pc30;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class Service {

    public void testMethod(Object lock){

        try {
            synchronized (lock){
                System.out.println("begin wait");
                //lock.wait();
                Thread.sleep(40000);
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
