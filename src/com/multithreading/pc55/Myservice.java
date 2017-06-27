package com.multithreading.pc55;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Myservice {

    private Lock lock = new ReentrantLock();

    private Condition conditionA = lock.newCondition();

    private Condition conditionB = lock.newCondition();

    public void awaitA() {

        try {
            lock.lock();
            System.out.println("begin awaitA time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {

        try {
            lock.lock();
            System.out.println("begin awaitB time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void singalAll_A(){

        try{
            lock.lock();
            System.out.println("begin  singalA time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
            conditionA.signalAll();

        }finally {
            lock.unlock();
        }
    }

    public void singalAll_B(){

        try{
            lock.lock();
            System.out.println("begin  singal time " + System.currentTimeMillis() + "Thread Name " + Thread.currentThread().getName());
            conditionB.signalAll();

        }finally {
            lock.unlock();
        }
    }

}
