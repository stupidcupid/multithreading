package com.multithreading.pc5;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class Run {

    public static void main(String[] args){

        MyProject object = new MyProject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");

        threadA.start();
        threadB.start();

    }

}
