package com.lzc.bean;

/**
 * @title: Husband
 * @Author luozouchen
 * @Date: 2022/10/30 21:53
 */
public class Husband {
    private String name;
    private Wife wife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
