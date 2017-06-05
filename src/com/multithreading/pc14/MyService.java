package com.multithreading.pc14;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {

        try {
            synchronized (list) {

                if (list.getSize() < 1) {

                    Thread.sleep(2000);
                    list.add(data);

                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
