package com.multithreading.pc53;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class Myservice {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {

        try {
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁已释放");
        }
    }
}
