package com.lzc.service;

import com.lzc.dao.OrderDao;

/**
 * @title: OrderService
 * @Author luozouchen
 * @Date: 2022/10/30 4:28
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
