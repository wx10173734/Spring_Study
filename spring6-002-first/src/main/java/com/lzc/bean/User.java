package com.lzc.bean;

/**
 * 这是一个bean,封装了用户的信息，Spring可以帮助我们创建对象
 * @title: User
 * @Author luozouchen
 * @Date: 2022/10/30 1:32
 */
public class User {
    //Spring默认情况下通过反射机制，调用类的无参构造方法来实例化对象
    //实现原理如下:
//    Class<?> aClass = Class.forName("com.lzc.bean.User");
//    aClass.newInstance();

    public User() {
        System.out.println("user的无参构造方法");
    }
}
