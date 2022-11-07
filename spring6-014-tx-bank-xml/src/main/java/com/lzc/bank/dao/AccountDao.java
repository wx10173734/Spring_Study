package com.lzc.bank.dao;

import com.lzc.bank.pojo.Account;

/**
 * 专门分组账户信息的crud
 * dao只执行sql语句，没有任何业务逻辑
 * 也就是说不和业务挂钩，只负责
 *
 * @title: AccountDao
 * @Author luozouchen
 * @Date: 2022/11/7 10:47
 */
public interface AccountDao {
    /**
     * 根据账号查询账户信息
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新账户信息
     * @param act
     * @return
     */
    int update(Account act);

    /**
     * 保存账户信息
     * @param act
     * @return
     */
    int insert(Account act);
}
