package com.multithreading.pc31;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Test {


    /**
     * notify() 执行后  不释放锁
     * @param args
     */
    public static void main(String[] args) {

        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

        synNotifyMethodThread synNotifyMethodThread = new synNotifyMethodThread(lock);
        synNotifyMethodThread.start();

    }
}
