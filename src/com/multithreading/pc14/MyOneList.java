package com.multithreading.pc14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {

        list.add(data);
    }

    synchronized public int getSize() {

        return list.size();
    }

}

