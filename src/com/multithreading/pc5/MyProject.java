package com.multithreading.pc5;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class MyProject {

   synchronized  public void methodA() {

        try {

            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
