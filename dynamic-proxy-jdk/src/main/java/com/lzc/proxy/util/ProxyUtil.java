package com.lzc.proxy.util;

import com.lzc.proxy.service.OrderService;
import com.lzc.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @title: ProxyUtil
 * @Author luozouchen
 * @Date: 2022/11/6 3:53
 */
public class ProxyUtil {
    /**
     * 封装一个工具方法，可以通过这个方法获取代理对象。
     * @param target
     * @return
     */
    public static Object newProxyInstance(Object target) {
        //底层调用的还是jdk的动态代理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimerInvocationHandler(target));

    }
}
