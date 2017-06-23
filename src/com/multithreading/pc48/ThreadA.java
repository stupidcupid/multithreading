package com.multithreading.pc48;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadA extends Thread {


    private ThreadB b;

    public ThreadA(ThreadB b) {

        super();
        this.b = b;
    }

    @Override
    public void run(){

        try {
            synchronized (b){
                System.out.println(" a run begin time " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println(" a run end time " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
