package com.lzc.bank.service.impl;

import com.lzc.bank.mapper.AccountMapper;
import com.lzc.bank.pojo.Account;
import com.lzc.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @title: AccountService
 * @Author luozouchen
 * @Date: 2022/11/8 14:16
 */
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;


    /**
     * 开户
     *
     * @param act
     * @return
     */
    @Override
    public int save(Account act) {
        return accountMapper.insert(act);
    }

    /**
     * 根据账号销户
     *
     * @param actno
     * @return
     */
    @Override
    public int deleteByActno(String actno) {
        return accountMapper.deleteByActno(actno);
    }

    /**
     * 修改账户
     *
     * @param act
     * @return
     */
    @Override
    public int update(Account act) {
        return accountMapper.update(act);
    }

    /**
     * 根据账号获取账户
     *
     * @param actno
     * @return
     */
    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    /**
     * 获取所有账户
     *
     * @return
     */
    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    /**
     * 转账
     *
     * @param fromActno
     * @param toActno
     * @param money
     */
    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account fromAct = accountMapper.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        Account toAct = accountMapper.selectByActno(toActno);

        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        int count = accountMapper.update(fromAct);

        String s = null;
        s.toString();

        count += accountMapper.update(toAct);

        if (count != 2) {
            throw new RuntimeException("转账失败");
        }

    }
}
