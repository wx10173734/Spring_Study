package com.lzc.bean;

/**
 * @title: Vip
 * @Author luozouchen
 * @Date: 2022/10/31 19:43
 */
public class Vip {
    private String name;
    private int age;
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
