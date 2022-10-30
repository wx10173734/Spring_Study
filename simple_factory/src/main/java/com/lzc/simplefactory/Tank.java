package com.lzc.simplefactory;

/**
 * @title: Tank
 * @Author luozouchen
 * @Date: 2022/10/30 16:52
 */
public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克开炮");
    }
}
