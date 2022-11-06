package com.lzc.test;

import com.lzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: SpringAOPTest
 * @Author luozouchen
 * @Date: 2022/11/6 16:23
 */
public class SpringAOPTest {
    @Test
    public void testXml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.logout();
    }
}
