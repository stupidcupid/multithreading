package com.multithreading.pc37;

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
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set 的值 " + value);
                ValueObject.value = value;
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
