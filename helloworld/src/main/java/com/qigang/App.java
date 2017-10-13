package com.qigang;

import com.qigang.dao.HelloWorldDao;
import com.qigang.service.AutoWiredByNameService;
import com.qigang.service.AutoWiredByTypeService;
import com.qigang.service.CustomerService;
import com.qigang.service.HelloWorldService;
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
        //1. 没有使用自动装配
        /*ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
        HelloWorldDao helloWorldDao = helloWorldService.getHelloWorldDao();
        helloWorldDao.sayHello();*/

        //2. 根据属性名称自动装配属性实例
        /*ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        AutoWiredByNameService helloWorldService = (AutoWiredByNameService) context.getBean("autoWiredByNameService");
        HelloWorldDao helloWorldDao = helloWorldService.getaHelloWorldDao();
        helloWorldDao.sayHello();*/

        //3. 根据属性的类型进行自动装配属性的实例
        /*ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        AutoWiredByTypeService helloWorldService = (AutoWiredByTypeService) context.getBean("autoWiredByTypeService");
        HelloWorldDao helloWorldDao = helloWorldService.getHelloWorldDao();
        helloWorldDao.sayHello();*/

        //4. 使用@Componeng, @AutoWired 自动扫描组件，自动装配, beans.xml中必须配置扫描范围
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = (CustomerService) context.getBean("CS");//名称是可以通过@Service("CS")自定义的
        customerService.sayHello();
    }
}
