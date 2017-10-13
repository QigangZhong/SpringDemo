package com.qigang.service;

import com.qigang.dao.HelloWorldDao;

/*根据属性名称自动装配示例*/
public class AutoWiredByNameService {
    private HelloWorldDao aHelloWorldDao;

    public AutoWiredByNameService(){

    }

    public HelloWorldDao getaHelloWorldDao() {
        return aHelloWorldDao;
    }

    public void setaHelloWorldDao(HelloWorldDao aHelloWorldDao) {
        this.aHelloWorldDao = aHelloWorldDao;
    }
}
