package com.lzc.bank.service.impl;

import com.lzc.bank.dao.AccountDao;
import com.lzc.bank.pojo.Account;
import com.lzc.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @title: AccountServiceImpl
 * @Author luozouchen
 * @Date: 2022/11/7 19:46
 */
@Service("accountService2")
//@Transactional
public class AccountServiceImpl2 implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    /**
     * 转账业务方法
     *
     * @param fromActno 从这个账户转出
     * @param toActno   转入这个账户
     * @param money     转账金额
     */
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    /**
     * 保存账户信息
     *
     * @param act
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        //模拟异常
        String s = null;
        s.toString();

        //事情没有处理完，这个大括号当中的数据也许还有其他的dml语句
    }
}
