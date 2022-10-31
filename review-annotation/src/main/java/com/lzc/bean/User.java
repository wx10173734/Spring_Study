package com.lzc.bean;

import com.lzc.annotation.Component;

/**
 * @title: User
 * @Author luozouchen
 * @Date: 2022/10/31 20:50
 */
//@Component(属性名=属性值，属性名=属性值，属性名=属性值)
//@Component(value = "UserBean")
//如果属性名是value value可以省略
@Component("UBean")
public class User {
    //编译器报错，不能出现在这里。
//    @Component(value = "test")
    private String name;

}
