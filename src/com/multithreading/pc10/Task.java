package com.multithreading.pc10;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Task {

    public void doLongTimeTask() {

        for (int i = 0; i < 100; i++) {

            System.out.println(" no synchronized ThreadName = " + Thread.currentThread().getName() + " i = " +(i+1));

        }
        System.out.println("           ");

        synchronized (this) {
            for (int i = 0; i < 100; i++) {

                System.out.println(" synchronized ThreadName = " + Thread.currentThread().getName() + " i = " + (i+1));

            }
        }

    }
}
