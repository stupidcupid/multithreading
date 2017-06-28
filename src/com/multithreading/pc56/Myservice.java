package com.multithreading.pc56;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Myservice {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean isHasValue = false;

    public void set() {

        try {
            lock.lock();
            while (isHasValue) {
                condition.await();
            }
            System.out.println("打印 ✨");
            isHasValue = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void get() {

        try {
            lock.lock();
            while (isHasValue == false) {
                condition.await();
            }
            System.out.println("打印 💗");
            isHasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}
