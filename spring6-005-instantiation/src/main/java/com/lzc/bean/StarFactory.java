package com.lzc.bean;

/**
 * 简单工厂模式中的工厂类角色，星工厂
 *
 * @title: StarFactory
 * @Author luozouchen
 * @Date: 2022/10/30 17:25
 */
public class StarFactory {
    //工厂类中有一个静态方法
    //简单工厂模式又叫做:静态I厂方法模式。
    public static Star get() {
        //这个Star对象最终实际上:创建的时候还是我们负责new的对象。
        return new Star();
    }
}
