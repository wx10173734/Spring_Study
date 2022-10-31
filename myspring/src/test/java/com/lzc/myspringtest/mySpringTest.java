package com.lzc.myspringtest;

import com.lzc.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @title: mySpringTest
 * @Author luozouchen
 * @Date: 2022/10/31 18:36
 */
public class mySpringTest {
    @Test
    public void testMySpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
        UserService userService = (UserService ) applicationContext.getBean("userService");
        userService.save();

    }
}
