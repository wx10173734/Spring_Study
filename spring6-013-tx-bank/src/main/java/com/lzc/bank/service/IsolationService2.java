package com.lzc.bank.service;

import com.lzc.bank.dao.AccountDao;
import com.lzc.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @title: IsolationService2
 * @Author luozouchen
 * @Date: 2022/11/7 21:07
 */
@Service("i2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    //2号
    //负责查询
//    @Transactional
//    public void save(Account account) {
//        accountDao.insert(account);
//
//        //睡眠一会
//        try {
//            Thread.sleep(1000 * 20);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    //    @Transactional(timeout = 10)//设置事务超时时间为10s
//    public void save(Account account) {
//        //睡眠一会
//        try {
//            Thread.sleep(1000 * 20);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        accountDao.insert(account);
//    }
    //设置只读事务作用是，启动Spring的优化策略，提高Select语句执行效率
//    @Transactional(readOnly = true, timeout = 10)//设置事务超时时间为10s
//    public void save(Account account) {
//        accountDao.insert(account);
//
//        //睡眠一会
//        try {
//            Thread.sleep(1000 * 5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Transactional(rollbackFor = RuntimeException.class)//只要发生RuntimeException或者这个异常的子类异常，都回滚
//    public void save(Account account) throws IOException {
//        accountDao.insert(account);
//
//        //模拟异常
//        if (1 == 1) {
////            throw new IOException();
//            throw new RuntimeException();
//        }
//
//        //睡眠一会
//        try {
//            Thread.sleep(1000 * 5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Transactional(noRollbackFor = NullPointerException.class)//只要发生RuntimeException或者这个异常的子类异常，都回滚
    public void save(Account account) throws IOException {
        accountDao.insert(account);

        //模拟异常
        if (1 == 1) {
//            throw new IOException();
            throw new NullPointerException();
        }

        //睡眠一会
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
