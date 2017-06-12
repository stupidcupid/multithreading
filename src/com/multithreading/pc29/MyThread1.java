package com.multithreading.pc29;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class MyThread1 extends Thread{

    private Object lock;

    public MyThread1(Object lock){

        super();
        this.lock = lock;
    }

    public void run(){

        try{
            synchronized (lock){

                System.out.println("开始时间 wait time + " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束时间 wait time + " + System.currentTimeMillis());
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
