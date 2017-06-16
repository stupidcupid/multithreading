package com.multithreading.pc37;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);

        threadP.start();
        threadC.start();
    }
}
