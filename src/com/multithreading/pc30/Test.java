package com.multithreading.pc30;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class Test {

    /**
     * 当方法wait()执行完后 锁被自动释放 但执行完 notify() 后锁不会被自动释放
     * @param args
     */
    public static void main(String[] args) {

        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
