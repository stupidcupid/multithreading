package com.multithreading.pc26;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class MyService
{

    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum(){

        System.out.println(Thread.currentThread().getName() + " + 100 后" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
