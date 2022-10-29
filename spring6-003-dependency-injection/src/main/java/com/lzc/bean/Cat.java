package com.lzc.bean;

/**
 * @title: Cat
 * @Author luozouchen
 * @Date: 2022/10/30 5:48
 */
public class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
