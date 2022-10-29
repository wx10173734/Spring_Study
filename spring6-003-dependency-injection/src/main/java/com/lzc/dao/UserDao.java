package com.lzc.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @title: UserDao
 * @Author luozouchen
 * @Date: 2022/10/30 3:47
 */
public class UserDao {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserDao.class);
    public void insert(){
//        System.out.println("数据库正在保存用户信息");
        //使用一下log4j2日志框架
        logger.info("数据库正在保存用户信息");
    }
}
