package com.lzc.myspring.bean;

/**
 * @title: UserService
 * @Author luozouchen
 * @Date: 2022/10/31 18:21
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
    }
}
