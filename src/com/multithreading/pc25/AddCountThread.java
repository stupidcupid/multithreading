package com.multithreading.pc25;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);


    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            System.out.println(count.incrementAndGet());
        }
    }


}
