package com.multithreading.pc54;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Myservice {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await() {

        try {
            lock.lock();
            System.out.println("await time = " + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {

        try {
            lock.lock();
            System.out.println("singal time = " + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }

    }
}
