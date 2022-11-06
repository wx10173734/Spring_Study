package com.lzc.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: SecurityLogAspect
 * @Author luozouchen
 * @Date: 2022/11/6 19:33
 */
@Component
@Aspect
public class SecurityLogAspect {
    @Pointcut("execution(* com.lzc.biz..save*(..))")
    public void savePointcut() {
    }

    @Pointcut("execution(* com.lzc.biz..delete*(..))")
    public void deletePointcut() {
    }

    @Pointcut("execution(* com.lzc.biz..update*(..))")
    public void updatePointcut() {
    }

    @Pointcut("execution(* com.lzc.biz..select*(..))")
    public void selectPointcut() {
    }

    @Before("savePointcut() || deletePointcut() || updatePointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        //系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        //输出日志信息
        System.out.println(nowTime + "张三" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
    }
}
