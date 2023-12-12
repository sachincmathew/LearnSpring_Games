package com.scm.spring.learnspringframework;

import com.scm.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.scm.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main (String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();

        MyWebController myWebController = context.getBean(MyWebController.class);
        //print integer value from MyWebController
        System.out.println("Value from MyWebController: " + myWebController.returnValueFromBusinessService());

    }

}
