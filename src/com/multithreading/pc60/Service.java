package com.multithreading.pc60;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {

        try {
            lock.lock();
            System.out.println("Thread name " + Thread.currentThread().getName() + "进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
