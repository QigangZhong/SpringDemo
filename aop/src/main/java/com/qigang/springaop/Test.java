package com.qigang.springaop;

import com.qigang.springaop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring提供的AOP,static方法和final方法都无法拦截,原因是此类方法无法生成代理类
 */
public class Test
{
    public static void main( String[] args )
    {
        //没有使用APO拦截的情况
        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService cust = (CustomerService) appContext.getBean("customerService");
        cust.printName();
        cust.printURL();
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }*/

        //使用APO拦截的情况
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
        cust.printName();
        cust.printURL();
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }
    }
}
