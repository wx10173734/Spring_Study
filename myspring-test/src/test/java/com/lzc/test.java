package com.lzc;

import com.lzc.bean.OrderService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @title: test
 * @Author luozouchen
 * @Date: 2022/10/31 19:49
 */
public class test {
    @Test
    public void testMySpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.generate();

    }
}
