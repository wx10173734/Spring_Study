package com.lzc.bank.service;

import com.lzc.bank.pojo.Account;

/**
 * 业务接口
 * 事务就是在这个接口下控制的
 *
 * @title: AccountService
 * @Author luozouchen
 * @Date: 2022/11/7 19:40
 */
public interface AccountService {
    /**
     * 转账业务方法
     *
     * @param fromActno 从这个账户转出
     * @param toActno   转入这个账户
     * @param money     转账金额
     */
    void transfer(String fromActno, String toActno, double money);

    /**
     * 保存账户信息
     * @param act
     */
    void save(Account act);
}
