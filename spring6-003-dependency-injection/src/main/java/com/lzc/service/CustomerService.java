package com.lzc.service;

import com.lzc.dao.UserDao;
import com.lzc.dao.VipDao;

/**
 * @title: CustomerService
 * @Author luozouchen
 * @Date: 2022/10/30 4:07
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService() {
    }

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void save() {
        userDao.insert();
        vipDao.insert();

    }
}
