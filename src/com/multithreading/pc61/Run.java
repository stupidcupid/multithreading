package com.multithreading.pc61;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {


    /**
     * 返回等待此锁相关的给定条件 condition的线程估计数
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                service.waitMethod();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++)
            threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++)
            threads[i].start();
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
