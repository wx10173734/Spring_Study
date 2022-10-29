package com.lzc.dao.impl;

import com.lzc.dao.UserDao;

/**
 * @title: UserDaoImplForMysql
 * @Author luozouchen
 * @Date: 2022/10/29 23:26
 */
public class UserDaoImplForMysql implements UserDao {
    /**
     * 根据id删除信息
     */
    @Override
    public void deleteById() {
        System.out.println("mysql数据库正在删除用户信息");
    }
}
