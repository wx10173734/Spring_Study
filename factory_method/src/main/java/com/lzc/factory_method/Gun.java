package com.lzc.factory_method;

/**
 * 具体产品角色
 * @title: Gun
 * @Author luozouchen
 * @Date: 2022/10/30 17:10
 */
public class Gun extends Weapon {
    @Override
    public void attack() {
        System.out.println("开枪");
    }
}
