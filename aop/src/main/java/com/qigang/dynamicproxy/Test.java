package com.qigang.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 使用纯java反射的方式，实现动态代理
 * https://www.cnblogs.com/gonjan-blog/p/6685611.html
 */
public class Test {
    public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
        Person zhangsan = new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new MyInvocationHandler(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(), zhangsan.getClass().getInterfaces(), stuHandler);

        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }
}
