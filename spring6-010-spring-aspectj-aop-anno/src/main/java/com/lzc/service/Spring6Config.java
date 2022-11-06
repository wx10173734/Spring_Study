package com.lzc.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @title: Spring6Config
 * @Author luozouchen
 * @Date: 2022/11/6 16:07
 */

@Configuration //代理spring.xml文件
@ComponentScan({"com.lzc.service"}) //组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) //启动aspectj的自动代理机制
public class Spring6Config {
}
