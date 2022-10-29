package com.lzc.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @title: VipDap
 * @Author luozouchen
 * @Date: 2022/10/30 4:01
 */
public class VipDao {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(VipDao.class);
    public void insert(){
//        System.out.println("数据库正在保存用户信息");
        //使用一下log4j2日志框架
        logger.info("正在保存vip信息");
    }
}
