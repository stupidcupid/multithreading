package com.multithreading.pc4;

/**
 * Created by nanzhou on 2017/5/27.
 */
public class Test {

    public static void main(String[] args)
    {

        HasSelfPrivateNum pNum = new HasSelfPrivateNum();
        ThreadA threadA  =  new ThreadA(pNum);
        threadA.start();
        ThreadB threadB  =  new ThreadB(pNum);
        threadB.start();
    }
}
