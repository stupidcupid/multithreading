package com.multithreading;

/**
 * Created by nanzhou on 2017/6/30.
 */
public class Main
{
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getIntance();
        Singleton singleton2 = Singleton.getIntance();
        Singleton singleton3 = Singleton.getIntance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());

    }
}
