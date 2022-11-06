package com.lzc.service;

import org.springframework.stereotype.Service;

/**
 * @title: AccountService
 * @Author luozouchen
 * @Date: 2022/11/6 16:34
 */
@Service
public class AccountService {
    //转账的业务方法
    public void transfer() {
        System.out.println("银行账户正在完成转账操作");
    }

    //取款的业务方法
    public void withdraw() {
        System.out.println("正在取款，请稍后..");
    }
}
