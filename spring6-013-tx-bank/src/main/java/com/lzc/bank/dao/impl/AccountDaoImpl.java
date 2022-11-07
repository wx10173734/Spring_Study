package com.lzc.bank.dao.impl;

import com.lzc.bank.dao.AccountDao;
import com.lzc.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @title: AccountDaoImpl
 * @Author luozouchen
 * @Date: 2022/11/7 19:37
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 根据账号查询账户信息
     *
     * @param actno
     * @return
     */
    @Override
    public Account selectByActno(String actno) {
        String sql = "select actno,balance from t_act where actno = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), actno);
        return account;
    }

    /**
     * 更新账户信息
     *
     * @param act
     * @return
     */
    @Override
    public int update(Account act) {
        String sql = "update t_act set balance = ? where actno = ?";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getActno());
        return count;
    }

    /**
     * 保存账户信息
     *
     * @param act
     * @return
     */
    @Override
    public int insert(Account act) {
        String sql = "insert into t_act values(?,?)";
        return jdbcTemplate.update(sql, act.getActno(), act.getBalance());
    }
}
