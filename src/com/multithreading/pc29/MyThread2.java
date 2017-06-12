package com.multithreading.pc29;

import com.multithreading.pc26.MyThread;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock){

        super();
        this.lock = lock;
    }

    @Override
    public void run(){

        synchronized (lock){
            System.out.println("开始时间 lock time + " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束时间 lock time + " + System.currentTimeMillis());
        }

    }

}
