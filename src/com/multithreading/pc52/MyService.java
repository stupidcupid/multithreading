package com.multithreading.pc52;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class MyService {

    private Lock lock = new ReentrantLock();


    public void testMethod() {

        lock.lock();
        for (int i = 0; i < 5; i++) {

            System.out.println("ThreadName = " + Thread.currentThread().getName() + " + " + (i + 1));
        }
        lock.unlock();
    }
}
