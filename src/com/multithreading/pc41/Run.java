package com.multithreading.pc41;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class Run {

    /**
     * 通过管道 进行线程间的通信 字节流
     */
    public static void main(String[] args) throws Exception{


        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream();

         //inputStream.connect(outputStream);
         outputStream.connect(inputStream);

        ThreadWrite write = new ThreadWrite(writeData, outputStream);

        write.start();

        Thread.sleep(2000);
        ThreadRead read = new ThreadRead(readData, inputStream);

        read.start();

    }
}
