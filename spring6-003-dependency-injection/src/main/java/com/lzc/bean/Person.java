package com.lzc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @title: Person
 * @Author luozouchen
 * @Date: 2022/10/30 5:39
 */
public class Person {
    //注入list集合
    private List<String> names;
    //注入Set集合
    private Set<String> addrs;
    private Map<Integer, String> phones;

    //注入属性类
    // Properties 本质上也是一- 个Map集合。
    // Properties 的父类Hashtable, Hashtable 实现TMap接口。、
    //虽然这个也是一-个Map 集合，但是和Map的注入方式有点像，但是不同。
    // Properties的key value只能是String类型。
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }
}
