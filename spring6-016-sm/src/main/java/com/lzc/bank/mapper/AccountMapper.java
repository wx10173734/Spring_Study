package com.lzc.bank.mapper;

import com.lzc.bank.pojo.Account;

import java.util.List;

/**
 * @title: AccountMapper
 * @Author luozouchen
 * @Date: 2022/11/8 14:04
 */
public interface AccountMapper {//该接口的实现类不需要写，是Mybatis通过动态代理机制生成的实现类

    //这就是dao,只要编写CRUD方法即可

    /**
     * 保存账户
     *
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 根据账号删除账户
     *
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 修改账户
     *
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 根据账号查询账户
     *
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 获取所有账户
     *
     * @return
     */
    List<Account> selectAll();

}
