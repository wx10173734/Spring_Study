package com.lzc.proxy.service;

/**
 * 订单业务接口
 *
 * @title: OrderService
 * @Author luozouchen
 * @Date: 2022/11/5 19:13
 */
public interface OrderService {//代理对象和目标对象公共接口

    /**
     * 生成订单
     */
    void generate();

    /**
     * 修改订单信息
     */
    void modify();

    /**
     * 查询订单详情
     */
    void detail();
}
