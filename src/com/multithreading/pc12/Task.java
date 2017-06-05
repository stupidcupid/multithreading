package com.multithreading.pc12;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Task {

    public void otherMethod() {

        System.out.println("--------------run----other---method");

    }

    public  void doLongTimeThread() {

        synchronized (this) {

            for (int i = 0; i < 10000; i++) {

                System.out.println("synchronized ThreadName= " + Thread.currentThread().getName() + " i = " + (i + 1));

            }

        }
    }
}
