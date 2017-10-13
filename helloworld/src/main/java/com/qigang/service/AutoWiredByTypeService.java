package com.qigang.service;

import com.qigang.dao.HelloWorldDao;

public class AutoWiredByTypeService {
    private HelloWorldDao helloWorldDao;

    public AutoWiredByTypeService(){}

    public HelloWorldDao getHelloWorldDao() {
        return helloWorldDao;
    }

    public void setHelloWorldDao(HelloWorldDao helloWorldDao) {
        this.helloWorldDao = helloWorldDao;
    }
}
