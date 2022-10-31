package com.lzc.bean2;

/**
 * 妻子类
 *
 * @title: Wife
 * @Author luozouchen
 * @Date: 2022/10/30 21:54
 */
public class Wife {
    private String name;
    private Husband husband;



    public String getName() {
        return name;
    }

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
