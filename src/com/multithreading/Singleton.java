package com.multithreading;

/**
 * Created by nanzhou on 2017/6/30.
 */
public class Singleton {

    private volatile static Singleton singleton;


    private Singleton() {

    }

    public static Singleton getIntance() {


        if (null == singleton) {


            synchronized (Singleton.class) {


                if (null == singleton) {

                    singleton =  new Singleton();
                }
            }
        }

            return singleton;
        }
    }


