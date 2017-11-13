package com.qigang.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    //invocationHandler持有的被代理对象
    Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("之前执行一些操作...");

        Object result = method.invoke(target, args);

        System.out.println("之后执行一些操作");

        return result;
    }
}