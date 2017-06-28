package com.multithreading.pc64;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {


    /**
     * lockInterruptibly() 如果当前线程未锁定 则获取锁定 如果已经被终端则抛出异常
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        final Myservice myservice = new Myservice();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                myservice.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();

        Thread.interrupted();
        System.out.println("Main end");

    }
}
