package com.lzc.bean;

/**
 * @title: OrderService
 * @Author luozouchen
 * @Date: 2022/10/31 19:45
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate() {
        orderDao.insert();
    }
}
