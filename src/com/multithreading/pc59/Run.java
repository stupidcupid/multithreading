package com.multithreading.pc59;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class Run {

    /**
     * getHoldCount 查询当前线程保持锁定的个数
     * @param args
     */
    public static void main(String[] args) {

        Service service = new Service();

        service.serviceMethod1();
    }
}
