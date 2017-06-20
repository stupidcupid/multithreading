package com.multithreading.pc41;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out) {

        System.out.println("write :  ");
        try {
            for (int i = 0; i < 300; i++) {

                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
