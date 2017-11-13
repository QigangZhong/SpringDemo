package com.qigang.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonServer bean = (PersonServerBean) appContext.getBean("personServerBean");
        bean.save("test");
    }
}
