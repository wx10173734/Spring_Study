package com.lzc.test;

import com.lzc.bean.Student;
import com.lzc.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: BeanLifeCycleTest
 * @Author luozouchen
 * @Date: 2022/10/30 20:34
 */
public class BeanLifeCycleTest {
    @Test
    public void testRegisterBean(){
        //自己New的对象
        Student student = new Student();
        System.out.println(student);
        //将以上自己new的对象纳入Spring容器来管理，半路上交给spring来管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);
        //从spring容器获取
        Object studentBean = factory.getBean("studentBean");
        System.out.println(studentBean);
    }


    /**
     * Spring容器只对singleton的bean进行完整的生命周期管理
     * 如果是prototype作用域的Bean，Spring 容器只负责将该Bean初始化完毕。等客户端程序-旦获取到该Bean之后，Spring 容器就不再管理该对象的生命周期了。.
     */
    @Test
    public void testBeanLifeCycleFive() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步 使用bean:" + user);
        //注意:必须手动关闭Spring容器，这样Spring容器才会销毁Bean.
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
