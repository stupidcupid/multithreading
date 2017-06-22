package com.multithreading.pc46;

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
                b.start();
                Thread.sleep(6000);
                //Thread.sleep() 不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
