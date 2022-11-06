package com.lzc.biz;

import org.springframework.stereotype.Service;

/**
 * @title: VipService
 * @Author luozouchen
 * @Date: 2022/11/6 16:45
 */
@Service
public class VipService {
    public void saveVip() {
        System.out.println("新增会员信息");
    }

    public void deleteVip() {
        System.out.println("删除会员信息");
    }

    public void updateVip() {
        System.out.println("修改会员信息");
    }

    public void selectVip() {
        System.out.println("查询会员信息");
    }
}
