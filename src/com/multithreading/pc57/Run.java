package com.multithreading.pc57;


/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {

    public static void main(String[] args) {

        Myservice myservice = new Myservice();
        ThreadA[] threadAS = new ThreadA[10];
        ThreadB[] threadBS = new ThreadB[10];

        for (int i = 0; i < 10; i++) {

            threadAS[i] = new ThreadA(myservice);
            threadBS[i] = new ThreadB(myservice);

            threadAS[i].start();
            threadBS[i].start();
        }


    }
}
