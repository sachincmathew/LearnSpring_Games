package com.scm.spring.learnspringframework.enterprise.example.web;

import com.scm.spring.learnspringframework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    private final BusinessService businessService;

    @Autowired
    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }
    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

}
