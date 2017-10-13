package com.qigang.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class CustomerMethodInterceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法调用之前做一些事情....");

        Object result = methodInvocation.proceed();

        System.out.println("方法调用之后做一些事情");

        return result;
    }
}
