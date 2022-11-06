package com.lzc.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/**
 * @title: TimerAspect
 * @Author luozouchen
 * @Date: 2022/11/6 16:14
 */
public class TimerAspect {
    //通知
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        //前环绕
        long begin = System.currentTimeMillis();
        //目标
        joinPoint.proceed();
        //后环绕
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-begin)+"毫秒");
    }
}
