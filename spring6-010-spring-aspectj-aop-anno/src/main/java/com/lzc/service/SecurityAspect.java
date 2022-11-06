package com.lzc.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @title: SecurityAspect
 * @Author luozouchen
 * @Date: 2022/11/6 15:58
 */
@Aspect
@Component
@Order(1)//数字越小优先级越高
public class SecurityAspect {//安全切面
    //切面=通知+切点
    @Before("com.lzc.service.LogAspect.commonPointCut()")
    public void beforeAdvice(){
        System.out.println("前置通知:安全...");
    }
}
