package com.lzc.test;

import com.lzc.service.OrderService;
import com.lzc.service.Spring6Config;
import com.lzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: SpringAOPTest
 * @Author luozouchen
 * @Date: 2022/11/6 15:09
 */
public class SpringAOPTest {
    @Test
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.login();
//        userService.logout();
        OrderService orderServic = applicationContext.getBean("orderService", OrderService.class);
        orderServic.generate();
    }

    @Test
    public void testNoXml(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
