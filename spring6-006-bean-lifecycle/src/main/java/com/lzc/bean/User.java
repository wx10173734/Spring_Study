package com.lzc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * bean的生命周期按照粗略的5步，
 * 第一步:实例化bean
 * 第二步:给bean属性赋值，调用set方法
 * 第三步:初始化bean 会调用bean的Init方法，这个Init方法要自己写，自己配
 * 第四步：使用bean
 * 第五步：销毁bean 调用Bean的destroy方法 注意:这个destory方法需要自己写，自己配
 *
 * @title: User
 * @Author luozouchen
 * @Date: 2022/10/30 20:29
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二步，给对象的属性赋值");
        this.name = name;
    }

    public User() {
        System.out.println("第一步，无参构造方法执行");
    }

    /*这个方法自己写，自己配，方法名随意*/
    public void initBean() {
        System.out.println("第四步 初始化bean");
    }

    /*这个方法自己写，自己配，方法名随意*/
    public void destroyBean() {
        System.out.println("第七步，销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean这个类的加载器:" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个bean的工厂对象是" + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("这个bean的名字是" + s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean's afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean‘s destroy方法执行");
    }
}
