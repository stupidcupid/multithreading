package com.multithreading.pc38;

/**
 * Created by nanzhou on 2017/6/16.
 */

//生产者
public class P {

    private String lock;

    public P(String lock){

        super();
        this.lock = lock;
    }

    public void setValue(){

        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者 wait " + Thread.currentThread().getName() + " WAITING ✨");
                    lock.wait();
                }
                System.out.println("生产者 wait " + Thread.currentThread().getName() + " RUNNBLE ✨");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
