package com.multithreading.pc32;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class Test {

    /**
     * (1) 执行完同步代码块后 会释放对象锁
     * (2) 在执行同步代码块的过程中 遇到异常而导致的线程终止 锁也会被释放
     * (3) 在执行同步代码块的过程中 执行了锁对象的wait()方法 这个线程会被释放对象锁 而线程会进入线程等待池中 等待被唤醒
     * @param args
     */
    public static void main(String[] args) {


        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(3000);
            threadA.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
