package com.scm.spring.learnspringframework.enterprise.example.business;

import com.scm.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    private final DataService dataService;

    @Autowired
    public BusinessService (DataService dataService) {
        this.dataService = dataService;
    }

    public long calculateSum () {

        long[] data = dataService.retrieveAllData();
        long sum = 0;
        for (long value : data) {
            sum += value;
        }
        return sum;
    }

}
