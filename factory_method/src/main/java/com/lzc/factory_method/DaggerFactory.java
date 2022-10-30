package com.lzc.factory_method;

/**
 * @title: DaggerFactory
 * @Author luozouchen
 * @Date: 2022/10/30 17:11
 */
public class DaggerFactory extends WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     *
     * @return
     */
    @Override
    public Weapon get() {
        return new Dagger();
    }
}
