package com.lzc.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @title: TimerMethodInterceptor
 * @Author luozouchen
 * @Date: 2022/11/6 4:12
 */
public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //前面增强
        long begin = System.currentTimeMillis();
        //怎么调用目标对象的目标方法
        Object retValue = methodProxy.invokeSuper(target, objects);
        //后面增强
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
        return retValue;
    }
}
