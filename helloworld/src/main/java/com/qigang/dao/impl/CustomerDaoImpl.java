package com.qigang.dao.impl;

import com.qigang.dao.CustomerDao;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void sayHello() {
        System.out.println("hello i'm customer....");
    }
}
