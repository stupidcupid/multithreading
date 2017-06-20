package com.multithreading.pc42;

import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class ThreadRead extends Thread {

    private ReadData readData;

    private PipedReader reader;

    public ThreadRead(ReadData readData, PipedReader reader) {

        super();
        this.readData = readData;
        this.reader = reader;

    }

    @Override
    public void run(){

        readData.readMethod(reader);
    }
}
