package com.lzc.factory_method;

/**
 * 具体工厂角色
 * @title: GunFactory
 * @Author luozouchen
 * @Date: 2022/10/30 17:11
 */
public class GunFactory extends WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     *
     * @return
     */
    @Override
    public Weapon get() {
        return new Gun();
    }
}
