package com.multithreading.pc43;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class Run {

    /**
     * 等待通知 交互
     *
     * @param args
     */
    public static void main(String[] args) {

        DBTools dbTools = new DBTools();

        for (int i = 0; i < 20; i++) {

            BackUpB out = new BackUpB(dbTools);
            out.start();

            BackUpA in = new BackUpA(dbTools);
            in.start();
        }
    }
}
