package com.multithreading.pc24;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {

    public static void main(String[] args) {

        MyThread[] myThread = new MyThread[100];
        for(int i =0;i < 100;i++){

            myThread[i] = new MyThread();

        }
        for(int i = 0;i< 100;i++){

            myThread[i].start();
        }
    }
}
