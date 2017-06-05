package com.multithreading.pc8;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Test {

    public static void main(String[] args) {

        Sub subRef = new Sub();

        MethodA methodA  = new MethodA(subRef);
        methodA.setName("a");
        methodA.start();
        MethodB methodB = new MethodB(subRef);
        methodB.setName("b");
        methodB.start();

    }
}
