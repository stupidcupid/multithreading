package com.multithreading.pc58;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {

        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {

        try {
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + "获取锁定");
        } finally {
            lock.unlock();
        }
    }
}
