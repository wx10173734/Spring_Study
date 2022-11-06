package com.lzc.service;

import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author luozouchen
 * @Date: 2022/11/6 15:00
 */
@Service
public class UserService {//目标类

    public void login() {//目标方法
        System.out.println("系统正在进行身份认证");
    }

    public void logout(){
        System.out.println("退出系统...");
    }
}
