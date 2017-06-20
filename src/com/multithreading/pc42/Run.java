package com.multithreading.pc42;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class Run {

    /**
     * 通过管道 进行线程间的通信 字符流
     */
    public static void main(String[] args) throws Exception{


        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();


        PipedWriter inputStream = new PipedWriter();
        PipedReader outputStream = new PipedReader();

         //inputStream.connect(outputStream);
         outputStream.connect(inputStream);

        ThreadWrite write = new ThreadWrite(writeData, inputStream);

        write.start();

        Thread.sleep(2000);
        ThreadRead read = new ThreadRead(readData, outputStream);

        read.start();

    }
}
