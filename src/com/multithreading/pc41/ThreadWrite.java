package com.multithreading.pc41;

import java.io.PipedOutputStream;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class ThreadWrite extends  Thread{

    private WriteData writeData;

    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStrea) {

        super();
        this.writeData = writeData;
        this.outputStream = outputStrea;
    }

    @Override
    public void run(){

        writeData.writeMethod(outputStream);
    }
}
