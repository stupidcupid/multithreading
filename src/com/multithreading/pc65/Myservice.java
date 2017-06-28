package com.multithreading.pc65;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Myservice {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {

        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
