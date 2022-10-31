package com.lzc.reflect;

/**
 * @title: SomeService
 * @Author luozouchen
 * @Date: 2022/10/31 10:51
 */
public class SomeService {
    public void doSome(){
        System.out.println("public void doSome()执行");
    }
    public String doSome(String s){
        System.out.println(" public void doSome(String s) 执行");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println(" public void doSome(String s,int i) 执行");
        return s + i;
    }
}
