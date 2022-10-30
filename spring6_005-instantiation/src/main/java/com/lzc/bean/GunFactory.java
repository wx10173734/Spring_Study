package com.lzc.bean;

/**
 * 工厂方法模式中的：具体工厂角色
 * @title: GunFactory
 * @Author luozouchen
 * @Date: 2022/10/30 19:01
 */
public class GunFactory {
    //工厂方法模式中的具体工厂角色中的方法是实例方法
    public Gun get(){
        //实际上New这个对象还是我们程序员自己New的
        return new Gun();
    }
}
