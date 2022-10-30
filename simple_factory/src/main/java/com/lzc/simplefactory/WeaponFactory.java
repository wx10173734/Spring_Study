package com.lzc.simplefactory;

/**
 * 工厂类角色
 *
 * @title: WeaponFactory
 * @Author luozouchen
 * @Date: 2022/10/30 16:53
 */
public class WeaponFactory {
    /**
     * 静态方法。要获取什么产品?就看你传什么参数，传TANK获取坦克，传DAGGER获取匕首，传FIGHTER获取战斗机
     * 简单工厂模式中有一个静态方法，所以被称为:静态I厂方法模式。
     *
     * @param weaponType
     * @return
     */
    public static Weapon get(String weaponType) {
        if ("TANK".equals(weaponType)) {
            return new Tank();
        } else if ("Dagger".equals(weaponType)) {
            return new Dagger();
        } else if ("Fighter".equals(weaponType)) {
            return new Fighter();
        } else {
            throw new RuntimeException("不支持该武器的生产");
        }
    }
}
