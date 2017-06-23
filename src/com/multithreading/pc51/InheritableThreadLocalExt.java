package com.multithreading.pc51;

import java.util.Date;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {


    @Override
    protected Object initialValue() {

        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {

        return parentValue + "childThread add";
    }

}
