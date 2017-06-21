package com.multithreading.pc43;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class BackUpA extends Thread {

    private DBTools dbTools;

    public BackUpA(DBTools dbTools) {

        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {

        dbTools.backupA();
    }
}
