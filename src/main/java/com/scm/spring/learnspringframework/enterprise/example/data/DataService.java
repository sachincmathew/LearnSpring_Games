package com.scm.spring.learnspringframework.enterprise.example.data;

import org.springframework.stereotype.Component;

@Component
public class DataService {

    public long[] retrieveAllData () {
        return new long[]{1000, 2000, 3000, 4000};
    }

}
