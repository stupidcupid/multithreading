package com.multithreading.pc53;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Run {

    public static void main(String[] args) {

        Myservice myservice = new Myservice();

        ThreadA threadA = new ThreadA(myservice);
        threadA.start();
    }
}
