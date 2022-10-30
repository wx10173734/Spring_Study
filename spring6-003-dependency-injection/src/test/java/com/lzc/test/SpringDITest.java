package com.lzc.test;

import com.lzc.bean.*;
import com.lzc.jdbc.MyDataSource;
import com.lzc.jdbc.MyDataSource1;
import com.lzc.jdbc.MyDataSource2;
import com.lzc.service.CustomerService;
import com.lzc.service.OrderService;
import com.lzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @title: SpringDITest
 * @Author luozouchen
 * @Date: 2022/10/30 3:52
 */
public class SpringDITest {
    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService csBean = applicationContext.getBean("csBean", CustomerService.class);
        csBean.save();

        CustomerService csBean1 = applicationContext.getBean("csBean2", CustomerService.class);
        csBean1.save();
        CustomerService csBean2 = applicationContext.getBean("csBean3", CustomerService.class);
        csBean2.save();
    }

    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean1 = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean1.generate();
        OrderService orderServiceBean2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }
    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
//        User userBean = applicationContext.getBean("userBean", User.class);
//        System.out.println(userBean);
        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);
    }

    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-datasource.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazzBean);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuqian = applicationContext.getBean("yuqian", QianDaYe.class);
        System.out.println(yuqian);

    }
    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);

    }

    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat cat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat.getName().toUpperCase());
    }

    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }

    @Test
    public void testP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }

    @Test
    public void testUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 myDataSource1 = applicationContext.getBean("ds1", MyDataSource1.class);
        MyDataSource2 myDataSource2 = applicationContext.getBean("ds2", MyDataSource2.class);
        System.out.println(myDataSource1);
        System.out.println(myDataSource2);
    }


}
