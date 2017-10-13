package com.qigang;

import com.qigang.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
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
