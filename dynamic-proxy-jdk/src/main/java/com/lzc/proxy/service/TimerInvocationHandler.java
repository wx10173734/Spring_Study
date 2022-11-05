package com.lzc.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 专门负责计时的一个调用处理器对象
 * 在这个调用处理器当中编写计时相关的增强代码。
 * 这个调用处理器只需要写一-个就行了。
 *
 * @title: TimerInvocationHandler
 * @Author luozouchen
 * @Date: 2022/11/6 3:22
 */
public class TimerInvocationHandler implements InvocationHandler {
    //目标对象
    private Object target;

    public TimerInvocationHandler(Object target) {
        //赋值给成员变量
        this.target = target;
    }

    /*
            1.为什么强行要求必须实现InvocationHandler接口？
            因为一个类实现接口就必须实现接口中的方法
            以下这个方法必须是invoke(),因为JDK在底层调用invoke()方法的程序经提前写好了。
            注意: invoke. 方法不是我们程序员负责调用的，是JDK 负责调用的。
            2.invoke方法什么是时候调用呢
                当代理对象调用代理方法的时候，注册在InvocationHandler 调用处理器当中的invoke方法被调用

            3.invoke方法的三个参数
                invoke方法是jdk负责调用的，所以jdk调用这个方法的时候会自动给我们传过来3个参数
                第一个参数: 0bject proxy代理对象的引用。这个参数使用较少。
                第二个参数: Method method目标对象 上的目标方法。( 要执行的目标方法就是它。)
                第三个参数: Object[] args目标方法上的实参。

               invoke方法执行过程中，使用method来调用目标对象的目标方法
         */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这个接口的目的是有地方写增强代码
        // System.out.println("增强1...");
        long begin = System.currentTimeMillis();
        //调用目标对象上的目标方法
        //方法四要素，哪个对象，哪个方法，传送门参数，返回什么值
        Object retValue = method.invoke(target, args);
        //System.out.println("增强2...");
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-begin)+"毫秒");
        //注意这个invoke方法的返回值， 如果代理对象调用代理方法之后，需要返回结果的话，invoke方法必须将目标对象的目标方法执行结果继续返回。
        return retValue;
    }
}
