package com.lzc.bean;

/**
 * 表示学生
 *
 * @title: Student
 * @Author luozouchen
 * @Date: 2022/10/30 5:00
 */
public class Student {
    private String name;
    //学生属于那个班级
    private Clazz clazz;

    //使用级联属性赋值，这个需要这个get方法。|
    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
