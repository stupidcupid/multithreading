package com.multithreading.pc42;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class ReadData {

    public void readMethod(PipedReader input) {

        try {
            System.out.println("read : ");
            char[] byteArr = new char[20];
            int readLength = input.read(byteArr);
            while (readLength != -1) {
                String newData = new String(byteArr, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArr);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
