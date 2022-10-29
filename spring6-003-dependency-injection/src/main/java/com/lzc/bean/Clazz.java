package com.lzc.bean;

/**
 * 表示班级
 * @title: Clazz
 * @Author luozouchen
 * @Date: 2022/10/30 5:00
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
