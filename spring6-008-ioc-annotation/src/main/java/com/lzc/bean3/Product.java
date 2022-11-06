package com.lzc.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @title: User
 * @Author luozouchen
 * @Date: 2022/10/31 22:45
 */
@Component
public class Product {
    //    @Value("隔壁老王")
//    private String name;
//    @Value("30")
//    private int age;
    private String name;
    private int age;

    //Value注解也可以使用在方法上。
//    @Value("隔壁老王")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Value("30")
//    public void setAge(int age) {
//        this.age = age;
//    }


    public Product(@Value("lzc") String name, @Value("42") int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
