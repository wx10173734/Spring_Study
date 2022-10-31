package com.lzc.client;

import com.lzc.annotation.Component;

/**
 * @title: ReflectAnnotationTest1
 * @Author luozouchen
 * @Date: 2022/10/31 20:51
 */
public class ReflectAnnotationTest1 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.lzc.bean.User");
        //判断类上面有没有这个注解
        if (aClass.isAnnotationPresent(Component.class)) {
            //获取类上的注解
            Component annotation = aClass.getAnnotation(Component.class);
            //访问注解属性
            System.out.println(annotation.value());
        }
    }
}
