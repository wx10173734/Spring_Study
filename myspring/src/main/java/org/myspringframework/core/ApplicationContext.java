package org.myspringframework.core;

/**
 * MySpring框架应用上下文
 * @title: ApplicationContext
 * @Author luozouchen
 * @Date: 2022/10/31 18:27
 */
public interface ApplicationContext {
    /**
     * 根据bean的名称获取对应的bean对象
     * @param beanName myspring配置文件中Bean标签的Id
     * @return 对应的单例bean对象
     */
    Object getBean(String beanName);
}
