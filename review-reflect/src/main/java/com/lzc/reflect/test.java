package com.lzc.reflect;

import java.lang.reflect.Method;

/**
 * @title: test
 * @Author luozouchen
 * @Date: 2022/10/31 10:54
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        //不使用反射机制调用对象
        SomeService someService = new SomeService();
        /**分析:调用一个方法，当中含有几个要素?四要素。
         *第一要素:调用哪个对象
         *第二要素:调用哪个方法
         *第三要素:调用方法的时候传什么参数
         * 第四要素：方法执行结束之后的返回结果
         *
         * 调用哪个对象的哪个方法传什么参数，返回什么值
         * 即使是使用反射机制调用方法，也同样需要具备这四个要素。
         */
        someService.doSome();
        someService.doSome("1");
        someService.doSome("1", 1);


    }
}
