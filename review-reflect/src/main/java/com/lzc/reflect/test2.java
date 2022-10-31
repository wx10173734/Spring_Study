package com.lzc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @title: test2
 * @Author luozouchen
 * @Date: 2022/10/31 10:59
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        //使用反射机制调用方法
        Class<?> aClass = Class.forName("com.lzc.reflect.SomeService");
        Method doSome = aClass.getDeclaredMethod("doSome", String.class, int.class);
        //调用方法
        //四要素:调用哪个对象、哪个方法、传什么参数、返回什么值。
        // obj要素:哪个对象
        // doSomeMethod要素:哪个方法
        //“李四”， 25日 要素:传什么参数
        // retValue 要素:返回什么值。
        Constructor<?> con = aClass.getDeclaredConstructor();//Object o = aClass.newInstance();
        Object o = con.newInstance();

        Object invoke = doSome.invoke(o, "李四", 250);
        System.out.println(invoke);
    }
}
