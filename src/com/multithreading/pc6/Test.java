package com.multithreading.pc6;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class Test {

    public static void main(String[] args){


        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
