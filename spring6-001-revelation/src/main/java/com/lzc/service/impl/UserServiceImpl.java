package com.lzc.service.impl;

import com.lzc.dao.UserDao;
import com.lzc.dao.impl.UserDaoImplForMysql;
import com.lzc.service.UserService;

/**
 * @title: UserServiceImpl
 * @Author luozouchen
 * @Date: 2022/10/29 23:27
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImplForMysql();

    /**
     * 删除用户信息
     */
    @Override
    public void deleteUser() {
        //处理删除用户信息的业务逻辑
        userDao.deleteById();
    }

}
