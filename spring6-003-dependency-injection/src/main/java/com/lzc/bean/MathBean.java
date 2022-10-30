package com.lzc.bean;

/**
 * @title: MathBean
 * @Author luozouchen
 * @Date: 2022/10/30 15:02
 */
public class MathBean {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}
