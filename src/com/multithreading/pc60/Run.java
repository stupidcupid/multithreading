package com.multithreading.pc60;

import com.multithreading.pc4.ThreadA;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {


    /**
     * getQueueLength 正等待此锁定的线程估计数
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                service.serviceMethod1();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {

            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {

            threads[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数 " + service.lock.getQueueLength() + "在等待获取锁");
    }
}
