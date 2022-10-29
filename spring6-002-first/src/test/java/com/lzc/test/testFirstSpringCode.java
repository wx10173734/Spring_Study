package com.lzc.test;

import com.lzc.bean.User;
import com.lzc.dao.UserDaoUnolForMysql;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: testFirstSpringCode
 * @Author luozouchen
 * @Date: 2022/10/30 2:24
 */
public class testFirstSpringCode {
    @Test
    public void testBeginInitBean(){
        //注意:不是在调用getBean()方法的时候调用对象，执行以下代码的时候，就会实例化对象
        new ClassPathXmlApplicationContext("spring.xml");

        //自己去使用log4j2记录日志信息
        //第一步:创建日志记录器对象
        //获取FirstSpringTest类的日志记录器对象， 也就是说只要是FirstSpringTest类中的代码执行记录日志的话， 就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(testFirstSpringCode.class);

        //第二步：记录日志，根据不同的级别来输出日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试消息");
        logger.error("我是一条错误消息");

    }
    @Test
    public void testBeanFactory() {
        //ApplicationContext接口的超级父接口是: BeanFactory (翻译为Bean 工厂，就是能够生产Bean对象的一-个I厂 对象。)
        //BeanFactory.是IoC容器的顶级接口。
        //Spring的IoC容器底层实际上使用了:工厂 模式。
        //Spring底层的IoC是怎么实现的? XML解析+ I厂 模式+反射机制
        //ApplicationContext applicationContext = new ClassPathXmLApplicationContext("spring6. xmZ");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testFirst() {
        // 第一步：初始化Spring容器上下文（解析beans.xml文件，创建所有的bean对象）
        /*
            ApplicationContext 为Spring容器
            ApplicationContext是一个接口
            ApplicationContext 接口下有很多实现类，其中一个叫ClassPathXmlApplicationContext
            ClassPathXmlApplicationContext 专门从类路径中加载Spring配置文件的Spring上下文对象
            只要执行：就相当于启动了spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器中
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml", "beans.xml", "xml/beans.xml");
        // 第二步：根据id获取bean对象
        Object userBean = applicationContext.getBean("userBean");
        Object userBean2 = applicationContext.getBean("userBean2");

//        Object userDaoBean = applicationContext.getBean("userDaoBean");
        UserDaoUnolForMysql userDaoBean = applicationContext.getBean("userDaoBean", UserDaoUnolForMysql.class);
        userDaoBean.insert();
        Object vipBean = applicationContext.getBean("vipBean");

        System.out.println(userBean);
        System.out.println(userDaoBean);
        System.out.println(vipBean);
        System.out.println(userBean2);

        //如果bean不存在，报异常不存在
        //Date nowTime = (Date) applicationContext.getBean("nowTime");
        //不想强制类型转换，可以使用以下代码(可以通过第二个参数来返回指定的bean返回类型)
        Date nowTime = applicationContext.getBean("nowTime", Date.class);
        System.out.println(nowTime);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(nowTime);
        System.out.println(format);

    }
}
