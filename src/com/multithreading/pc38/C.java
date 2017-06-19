package com.multithreading.pc38;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class C {

    private String lock;

    public C(String lock) {

        super();
        this.lock = lock;

    }

    public void getValue() {

        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者" + Thread.currentThread().getName() + " WAITING✨");
                    lock.wait();
                }
                System.out.println("消费者" + Thread.currentThread().getName() + " RUNNABLE✨");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
