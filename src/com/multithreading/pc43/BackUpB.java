package com.multithreading.pc43;

/**
 * Created by nanzhou on 2017/6/20.
 */
public class BackUpB extends  Thread{

    private DBTools dbTools;

    public BackUpB(DBTools dbTools) {

        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {

        dbTools.backupB();
    }
}
