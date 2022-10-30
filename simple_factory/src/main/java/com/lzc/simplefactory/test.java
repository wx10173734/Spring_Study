package com.lzc.simplefactory;

/**
 * 这是客户端程序
 * @title: test
 * @Author luozouchen
 * @Date: 2022/10/30 16:56
 */
public class test {
    public static void main(String[] args) {
        //需要坦克
        //对于我客户端来说，坦克的生产细节，我不需要关心，我只需要向工厂索要即可。
        //简单工厂模式达到了什么呢?职责分离。客户端不需要关心产品的生产细节。
        //客户端只负责消费。II 类负责生产。一个负责生产，一 个负 责消费。生产者 和消费者分离了。这就是简单I厂模式的作用。
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //需要匕首
        Weapon dagger = WeaponFactory.get("Dagger");
        dagger.attack();
        //需要战斗机
        Weapon fighter = WeaponFactory.get("Fighter");
        fighter.attack();
    }
}
