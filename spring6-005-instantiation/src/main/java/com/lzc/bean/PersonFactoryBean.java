package com.lzc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @title: PersonFactoryBean
 * @Author luozouchen
 * @Date: 2022/10/30 19:17
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    // PersonFactoryBean 也是一个Bean。 只不过这个Bean比较特殊。叫做工厂Bean。
    //通过工厂Bean这个特殊的Bean可以获取一- 个普通的Bean。
    @Override
    public Person getObject() throws Exception {
        //最终这个bean的创建还是程序员自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /*这个方法在接口中默认实现
     * 默认返回true,表示单例
     * 如果想多例，直接将这个方法改为return false即可
     * */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
