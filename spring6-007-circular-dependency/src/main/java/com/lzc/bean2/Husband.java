package com.lzc.bean2;

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

    public Husband(String name, Wife wife) {
        this.name = name;
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
