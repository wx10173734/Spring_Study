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
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    //控制事务，因为这个方法中要完成所有的转账业务
    @Override
    public void transfer(String fromActno, String toActno, double money) {
        //第一步:开启事务


        //第二步:执行核心业务逻辑
        //查询转出的账户余额是否充足
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("余额不足!");
        }
        //余额充足
        Account toAct = accountDao.selectByActno(toActno);
        //将内存中两个对象的余额先修改
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        //数据库更新
        int count = accountDao.update(fromAct);

        //模拟异常
//        String s = null;
//        s.toString();

        count += accountDao.update(toAct);
        if (count != 2) {
            throw new RuntimeException("转账失败，联系银行");
        }

        //第三步:如果执行业务流程过程中，没有异常，提交事务

        //第四步:如果执行业务流程过程中，有异常，回滚事务
    }


}
