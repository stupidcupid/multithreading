package com.multithreading.pc57;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Myservice {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean hasValue = false;

    public void set() {

        try {
            lock.lock();
            while (hasValue) {
                System.out.println("✨✨ 连续");
                condition.await();
            }
            System.out.println("打印 ✨");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {

        try {
            lock.lock();
            while (hasValue == false) {
                System.out.println("💗💗 连续");
                condition.await();
            }
            System.out.println("打印 💗");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
