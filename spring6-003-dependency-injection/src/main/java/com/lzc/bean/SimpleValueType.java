package com.lzc.bean;


import java.util.Date;

/**
 * 测试简单类型
 *
 * @title: SimpleValueType
 * @Author luozouchen
 * @Date: 2022/10/30 4:40
 */
public class SimpleValueType {
    /*
     *
     * ClassUtils.isPrimitiveOrWrapper(type) ||
     * Enum.class.isAssignableFrom(type) ||
     * CharSequence.class.isAssignableFrom(type) ||
     * Number.class.isAssignableFrom(type) ||
     * Date.class.isAssignableFrom(type) ||
     * Temporal.class.isAssignableFrom(type) ||
     * URI.class == type || URL.class == type ||
     * Locale.class == type || Class.class == type);
     * */
    private int age;
    private Integer age2;
    private boolean flag;
    private Boolean flag2;
    private char c;
    private Character c2;
    private Season season;
    private String username;
    private Class clazz;
    private Date brithday;

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "age=" + age +
                ", age2=" + age2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", c=" + c +
                ", c2=" + c2 +
                ", season=" + season +
                ", username='" + username + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
