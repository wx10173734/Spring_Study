package com.lzc.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @title: TransactionAspect
 * @Author luozouchen
 * @Date: 2022/11/6 16:37
 */
@Component
@Aspect
public class TransactionAspect {
    //编程式事务解决方案
    @Around("execution(* com.lzc.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        //执行目标
        try {
            //前环绕
            System.out.println("开启事务");
            joinPoint.proceed();
            //后环绕
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
            throw new RuntimeException(e);
        }
    }
}
