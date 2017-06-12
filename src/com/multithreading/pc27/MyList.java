package com.multithreading.pc27;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class MyList {

    private static List list = new ArrayList();


    public static void add() {
        list.add("多线程");
    }

    public static  int size() {

        return list.size();
    }
}
