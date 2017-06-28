package com.multithreading.pc65;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {

    /**
     * boolean tryLock() 仅在调用锁定未被另一个线程保持的情况下 才获取该锁定
     * boolean tryLock(long timeout,TimeUnit unit) 如果调用锁定在给定等待时间内未被另一个线程保持 且未中断 则获取该锁定
     * @param args
     */
    public static void main(String[] args) {

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

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();

    }
}
