package com.multithreading.pc42;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class ThreadWrite extends Thread {

    private WriteData writeData;

    private PipedWriter writer;

    public ThreadWrite(WriteData writeData,PipedWriter writer) {

        super();
        this.writeData = writeData;
        this.writer = writer;
    }

    @Override
    public void run() {

        writeData.writeMethod(writer);
    }
}
