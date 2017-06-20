package com.multithreading.pc41;

import java.io.PipedInputStream;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class ThreadRead extends Thread {

    private ReadData readData;

    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {

        super();
        this.readData = readData;
        this.inputStream = inputStream;

    }

    @Override
    public void run(){

        readData.readMethod(inputStream);
    }
}
