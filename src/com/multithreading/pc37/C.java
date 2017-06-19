package com.multithreading.pc37;

/**
 * Created by nanzhou on 2017/6/16.
 */
//消费者
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
                    lock.wait();
                }
                System.out.println("get 的值 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
