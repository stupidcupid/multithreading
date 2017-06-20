package com.multithreading.pc42;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class WriteData {

    public void writeMethod(PipedWriter out) {

        System.out.println("write :  ");
        try {
            for (int i = 0; i < 300; i++) {

                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
