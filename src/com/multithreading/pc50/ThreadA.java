package com.multithreading.pc50;

import java.util.Date;

/**
 * Created by nanzhou on 2017/6/22.
 */
public class ThreadA extends Thread {

    @Override
    public void run() {

        try {

            for (int i = 0; i < 20; i++) {

                if (Tools.t1.get() == null) {

                    Tools.t1.set(new Date());
                }
                System.out.println("A" + Tools.t1.get().getTime());
            }
            Thread.sleep(100);

        } catch (InterruptedException e) {

        }

    }
}
