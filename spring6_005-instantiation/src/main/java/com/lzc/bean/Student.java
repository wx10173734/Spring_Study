package com.lzc.bean;

import java.util.Date;

/**
 * @title: Student
 * @Author luozouchen
 * @Date: 2022/10/30 19:57
 */
public class Student {
    // java.util.Date 在Spring 当中被当做简单类型。但是简单类 型的话，注入的日期字符串格式有要求。
// java.util. Date在Spring 当中也可以被当做非简单类型。
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
