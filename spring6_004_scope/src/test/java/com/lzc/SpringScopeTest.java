package com.lzc;

import com.lzc.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: SpringScopeTest
 * @Author luozouchen
 * @Date: 2022/10/30 16:15
 */
public class SpringScopeTest {
    @Test
    public void testBeanScope() {
        /**
         * 1.spring默认情况下是如何管理这个bean的
         *  默认情况下Bean是单例的。(单例:singleton)
         * 在Spring上下文初始化的时候实例化。
         * 每-次调用getBean()方法的时候，都返回那个单例的对象。
         *2.当将bean 的scope属性设置为prototype: I
         * bean是多例的。
         * spring.上:下文初始化的时候，并不会初始化这些prototype的bean.
         * 每-次调用getBean()方法的时候，实例化该bean对象。
         * prototype翻译为:原型。|
         *
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
//        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb);
//        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb2);
//        SpringBean sb3 = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb3);
    }

    @Test
    public void testThreadScope() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
        SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        //启动一个新的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
                System.out.println(sb2);
                SpringBean sb3 = applicationContext.getBean("sb", SpringBean.class);
                System.out.println(sb3);
            }
        }).start();
    }
}
