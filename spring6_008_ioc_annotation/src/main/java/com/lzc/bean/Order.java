package com.lzc.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @title: Order
 * @Author luozouchen
 * @Date: 2022/10/31 21:48
 */
@Service //如果你把整个value属性全部省略了，bean 有没有默认的名称?有:类名首字母变小写就是bean的名字。
public class Order {
}
/**
 * 以上:的这个注解@Service就相当于以下的这个配置信息:
 * <bead id="order" class="com.lzc.bean.Order"/>
 */
