package com.lzc.web;

import com.lzc.service.UserService;
import com.lzc.service.impl.UserServiceImpl;

/**
 * 表示层
 *
 * @title: UserAction
 * @Author luozouchen
 * @Date: 2022/10/29 23:25
 */
public class UserAction {
    private UserService userService = new UserServiceImpl();

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest() {
        userService.deleteUser();
    }
}
