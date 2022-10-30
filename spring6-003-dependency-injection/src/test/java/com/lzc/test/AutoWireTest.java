package com.lzc.test;

import com.lzc.jdbc.MyDataSource;
import com.lzc.jdbc.MyDataSource1;
import com.lzc.jdbc.MyDataSource2;
import com.lzc.service.CustomerService;
import com.lzc.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: AutoWireTest
 * @Author luozouchen
 * @Date: 2022/10/30 15:39
 */
public class AutoWireTest {
    @Test
    public void testAutoWire1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAutoWire2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        CustomerService customerService = applicationContext.getBean("cs", CustomerService.class);
        customerService.save();
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }
}
