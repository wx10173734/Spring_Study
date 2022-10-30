package com.lzc.factory_method;

/**
 * 抽象工厂角色
 *
 * @title: WeaponFactory
 * @Author luozouchen
 * @Date: 2022/10/30 17:10
 */
public abstract class WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     *
     * @return
     */
    public abstract Weapon get();
}
