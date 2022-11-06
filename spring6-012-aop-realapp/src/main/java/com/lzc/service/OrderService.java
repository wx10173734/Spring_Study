package com.lzc.service;

import org.springframework.stereotype.Service;

/**
 * @title: OrderService
 * @Author luozouchen
 * @Date: 2022/11/6 16:35
 */
@Service
public class OrderService {
    //目标方法
    //生成订单的业务方法
    public void generate(){
        System.out.println("正在生成订单");
    }
    //目标方法
    //取消订单的业务方法
    public void cancel(){
        System.out.println("订单已取消");
        String s= null;
        s.toString();
    }
}
