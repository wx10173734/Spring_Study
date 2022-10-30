package com.lzc.factory_method;

/**
 * 客户端程序
 * @title: test
 * @Author luozouchen
 * @Date: 2022/10/30 17:12
 */
public class test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        weaponFactory.get().attack();
        WeaponFactory weaponFactory1 = new GunFactory();
        weaponFactory1.get().attack();

    }
}
