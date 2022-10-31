package com.lzc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @title: test4
 * @Author luozouchen
 * @Date: 2022/10/31 11:08
 */
public class test4 {
    public static void main(String[] args) throws Exception {
        /*
        需求:
        假设你现在已知以下信息:
        1.有这样一个类，类名叫做: com. powernode . reflect. User
        2.这个类符合javabean规范。属性私有化，对外提供公开的setter和getter方法。
        3.你还知道这个类当中有一.个属性， 属性的名字叫做age
        4.并且你还知道age属性的类型是int类型。
        请使用反射机制调用set方法，给User对 象的age属性赋值。
        */

        String cLassName = "com.lzc.reflect.User";
        String propertyName = "age";
        //通过反射机制调用setAge(int方法)
        //获取类
        Class<?> aClass = Class.forName(cLassName);
        //获取方法名
        String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
        //根据属性名获取属性类型
        Field age = aClass.getDeclaredField(propertyName);
        Method declaredMethod = aClass.getDeclaredMethod(setMethodName, age.getType());
        //准备对象
        Object o = aClass.newInstance();
        declaredMethod.invoke(o, 23);
        System.out.println(o);


    }
}
