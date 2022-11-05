package com.lzc.proxy.client;

import com.lzc.proxy.service.OrderService;
import com.lzc.proxy.service.OrderServiceImpl;
import com.lzc.proxy.service.OrderServiceProxy;

/**
 * @title: Test
 * @Author luozouchen
 * @Date: 2022/11/5 19:17
 */
public class Test {
    public static void main(String[] args) {
//        OrderService orderService = new OrderServiceImpl();
//        orderService.generate();
//        orderService.detail();
//        orderService.modify();
        //创建目标对象
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy(target);
        //调用代理对象的代理方法
        orderServiceProxy.modify();
        orderServiceProxy.generate();
        orderServiceProxy.detail();
    }
}
