package com.lzc.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @title: LogAspect
 * @Author luozouchen
 * @Date: 2022/11/6 15:01
 */
@Component
@Aspect //切面类需要使用@Aspect注解来标注
@Order(2)
public class LogAspect {//切面

    //切面= 通知+切点
    //通知就是增强，就是具体要编写的增强代码
    //这里通知advice以方法的形式出现，因为方法中可以写代码
    //@Before注解标注的方法就是一个前置通知
//    @Before("execution(修饰符 返回值类型 全限定类名 方法名(形式参数列表) 异常)")
//    @Before("execution(* com.lzc.service..*(..))")
//    public void 增强() {
//        System.out.println("我是一个通知，我是一段增强代码");
//    }
    //定义通用的切点表达式
    @Pointcut("execution(* com.lzc.service..*(..))")
    public void commonPointCut() {
        //这个方法只是一一个标记， 方法名随意，方法体中也不需要写任何代码。
    }

    //前置通知
    @Before("commonPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("前置通知");
        //这个JoinPoint joinPoint， 在Spring 容器调用这个方法的时候自动传过来。
        //我们可以直接用。用这个JoinPoint joinPoint 干啥?
        Signature signature = joinPoint.getSignature();//获取目标方法的签名
        System.out.println(signature);
        //通过方法的签名可以获取到一个方法的具体信息
        //获取目标方法的方法名
        System.out.println("目标方法的方法名" + joinPoint.getSignature().getName());
    }

    //后置通知
    @AfterReturning("commonPointCut()")
    public void afterReturningAdvice() {
        System.out.println("后置通知");
    }

    //环绕通知(环绕是最大的通知， 在前置通知之前，在后置通知之后。)
    @Around("commonPointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        //前面的代码
        System.out.println("前环绕");
        //执行目标
        joinPoint.proceed();//执行目标
        //后面的代码
        System.out.println("后环绕");

    }

    //异常通知
    @AfterThrowing("commonPointCut()")
    public void afterThrowingAdvice() {
        System.out.println("异常通知");
    }

    //最终通知(finally语句块通知)
    @After("commonPointCut()")
    public void afterAdvice() {
        System.out.println("最终通知");
    }
}
