package com.lzc.biz;

import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author luozouchen
 * @Date: 2022/11/6 16:45
 */
@Service
public class UserService {
    public void saveUser() {
        System.out.println("新增用户信息");
    }

    public void deleteUser() {
        System.out.println("删除用户信息");
    }

    public void updateUser() {
        System.out.println("修改用户信息");
    }

    public void selectUser() {
        System.out.println("查询用户信息");
    }

}
