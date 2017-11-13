package com.qigang.aspectj;

import org.springframework.stereotype.Component;

@Component("personServerBean")
public class PersonServerBean implements PersonServer {
    @Override
    public void save(String name) {
        System.out.println("save方法");
    }

    @Override
    public void update(String name, Integer id) {
        System.out.println("update方法");
    }

    @Override
    public String getPersonName(Integer id) {
        System.out.println("getPersonName方法");
        return "myName";
    }
}