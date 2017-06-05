package com.multithreading.pc10;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Test extends Object{


    public static void main(String[] args) {

        Task task = new Task();

        ThreadA threadA = new ThreadA(task);

        threadA.start();

        ThreadB threadB = new ThreadB(task);
        threadB.start();


    }


}
