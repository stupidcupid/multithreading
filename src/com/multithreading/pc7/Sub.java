package com.multithreading.pc7;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class Sub extends Main {


    synchronized public void operateISubMethod() {

        while (i > 0) {

            try {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateMainMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
