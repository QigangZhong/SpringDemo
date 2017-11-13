package com.qigang.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyInterceptor {

    @Pointcut("execution(* com.qigang.aspectj.PersonServerBean.*(..))")
    private void anyMethod(){}

    @Before("anyMethod()")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }

    @After("anyMethod()")
    public void after() {
        System.out.println("最终结果");
    }

    @AfterReturning("anyMethod()")
    public void doAfter() {
        System.out.println("后置通知");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow() {
        System.out.println("例外通知");
    }

    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();
        System.out.println("退出方法");
        return object;
    }
    // 顺序: before->method->after->afterReturning
}