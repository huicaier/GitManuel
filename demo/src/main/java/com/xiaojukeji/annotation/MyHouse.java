package com.xiaojukeji.annotation;

/**
 * Created by wangguangfei on 18/1/24.
 */
public class MyHouse implements House {

    @Deprecated
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void openFrontDoor() {
        System.out.println("openFrontDoor");
    }
}
