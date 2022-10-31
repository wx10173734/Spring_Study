package com.lzc.test;

import com.lzc.bean.Husband;
import com.lzc.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: CircularDependency
 * @Author luozouchen
 * @Date: 2022/10/30 21:59
 */
public class CircularDependency {
    @Test
    public void testCD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);

    }

    @Test
    public void testCD2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Husband husbandBean = applicationContext.getBean("h", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("w", Wife.class);
        System.out.println(wifeBean);

    }
}
