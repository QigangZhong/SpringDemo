package com.qigang.service;

import com.qigang.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CS")
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void sayHello(){
        customerDao.sayHello();
    }

}