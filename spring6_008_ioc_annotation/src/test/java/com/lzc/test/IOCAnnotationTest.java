package com.lzc.test;

import com.cn.lzc.Spring6Config;
import com.cn.lzc.service.StudentService;
import com.lzc.bean.Order;
import com.lzc.bean.Student;
import com.lzc.bean.User;
import com.lzc.bean.Vip;
import com.lzc.bean3.MyDataSource;
import com.lzc.bean3.Product;
import com.lzc.dao.OrderDao;
import com.org.lzc.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @title: IOCAnnotationTest
 * @Author luozouchen
 * @Date: 2022/10/31 21:49
 */
public class IOCAnnotationTest {
    @Test
    public void testBeanComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("product", User.class);
        Vip vipBean = applicationContext.getBean("vip", Vip.class);
        Order orderBean = applicationContext.getBean("order", Order.class);
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(orderBean);
        System.out.println(studentBean);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }

    @Test
    public void testChoose() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testDIByAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void testAutowired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();

    }

    @Test
    public void testResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ressource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();

    }
    @Test
    public void testNoXML(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }
}
