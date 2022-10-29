package com.lzc.bean;

/**
 * @title: Woman
 * @Author luozouchen
 * @Date: 2022/10/30 5:36
 */
public class Woman {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }
}
