package com.cn.lzc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 编写一个类，代替Spring框架的配置文件
 *
 * @title: Spring6Config
 * @Author luozouchen
 * @Date: 2022/10/31 23:58
 */
@Configuration
@ComponentScan({"com.cn.lzc.dao","com.cn.lzc.service"})
public class Spring6Config {
}
