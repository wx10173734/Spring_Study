package com.lzc.proxy.service;

/**
 * @title: OrderServiceProxy
 * @Author luozouchen
 * @Date: 2022/11/5 21:49
 */
//代理对象（代理对象和目标对象要具有相同的行为，就要实现同一个或同一些接口）
//客户端在使用代理对象的时候就像在使用目标对象一样
public class OrderServiceProxy implements OrderService {
    //将目标对象作为代理对象的一个属性，这种叫做关联关系，比继承关系耦合度低
    //代理对象中含有目标对象的引用，关联关系 has a
    //注意:这里要写一个公共接口类型，因为公共接口耦合度低
    private OrderService target;//这就是目标对象，目标对象一定是实现了orderService接口的

    //创建代理对象的时候，传一个目标对象给代理对象
    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    /**
     * 生成订单
     */
    @Override
    public void generate() {//代理方法
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
    }

    /**
     * 修改订单信息
     */
    @Override
    public void modify() {//代理方法
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
    }

    /**
     * 查询订单详情
     */
    @Override
    public void detail() {//代理方法
        //增强
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
    }
}
