package com.qigang.service;

import com.qigang.dao.HelloWorldDao;

public class HelloWorldService {
    private HelloWorldDao helloWorldDao;

    public HelloWorldService(){

    }

    public HelloWorldDao getHelloWorldDao() {
        return helloWorldDao;
    }

    public void setHelloWorldDao(HelloWorldDao helloWorldDao) {
        this.helloWorldDao = helloWorldDao;
    }
}
