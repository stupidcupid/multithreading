package com.multithreading.pc8;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Sub extends  Main {

    @Override
    synchronized public void serviceMethod(){

        try {
            System.out.println("int sub 下一步 sleep begin threadName " + Thread.currentThread().getName() + "Time" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName " + Thread.currentThread().getName() + "Time" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
