package com.multithreading.pc22;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {

    public static void main(String[] args) {

        PrintString printStrService = new PrintString();

        new Thread(printStrService).start();

        System.out.println("stopThread = " + Thread.currentThread().getName());
        printStrService.setContinuePrint(false);
    }
}
