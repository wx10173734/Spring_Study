package com.lzc.client;

import com.lzc.web.UserAction;

/**
 * @title: Test
 * @Author luozouchen
 * @Date: 2022/10/29 23:32
 */
public class Test {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        bmw = null;
        System.gc();
        System.out.println("tuichu,.....");
    }
}

class Car {
    private String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁了。。。。。");
    }

    public Car(String name) {
        this.name = name;
    }
}