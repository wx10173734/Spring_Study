package com.org.lzc.dao.impl;

import com.org.lzc.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @title: OrderDaoImplForMysql
 * @Author luozouchen
 * @Date: 2022/10/31 22:52
 */
//@Repository
public class OrderDaoImplForMysql implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql数据库正在保存数据");
    }
}
