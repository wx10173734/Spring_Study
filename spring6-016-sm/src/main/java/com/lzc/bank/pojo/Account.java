package com.lzc.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title: Account
 * @Author luozouchen
 * @Date: 2022/11/8 14:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String actno;
    private Double balance;
}
