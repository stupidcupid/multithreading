package com.multithreading.pc66;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {

            try {
                lock.readLock().lock();
                System.out.println("获得读锁 Thread Name " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void write(){

        try {

            try {
                lock.writeLock().lock();
                System.out.println("获得写锁 Thread Name " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

                Thread.sleep(10000);
            } finally {
                lock.writeLock().lock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
