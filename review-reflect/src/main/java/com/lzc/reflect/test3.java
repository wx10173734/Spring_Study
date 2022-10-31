package com.lzc.reflect;

import java.lang.reflect.Method;

/**
 * @title: test3
 * @Author luozouchen
 * @Date: 2022/10/31 11:06
 */
public class test3 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.lzc.reflect.SomeService");
        Method doSome = aClass.getDeclaredMethod("doSome");
        Object o = aClass.newInstance();
        System.out.println(doSome.invoke(o));
    }
}
