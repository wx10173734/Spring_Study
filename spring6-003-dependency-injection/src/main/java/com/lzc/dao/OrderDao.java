package com.lzc.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @title: OrderDao
 * @Author luozouchen
 * @Date: 2022/10/30 4:27
 */
public class OrderDao {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(OrderDao.class);

    public void insert() {
        logger.info("订单正在生成");
    }
}
