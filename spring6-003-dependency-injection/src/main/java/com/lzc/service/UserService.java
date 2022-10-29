package com.lzc.service;

import com.lzc.dao.UserDao;
import com.lzc.dao.VipDao;

/**
 * @title: UserService
 * @Author luozouchen
 * @Date: 2022/10/30 3:49
 */
public class UserService {
    private UserDao userDao;
    private VipDao vipDao;

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    //set注入必须提供Set方法，spring容器会调用set方法来发给userDao属性赋值
    public void saveUser() {
        //保存用户信息到数据库
        userDao.insert();
        vipDao.insert();
    }

    //自己写set方法，不使用idea自动生成的 方法要以set单词开始，必须是set
//    public void setMysqlUserDao(UserDao xyz) {
//        this.userDao = xyz;
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
