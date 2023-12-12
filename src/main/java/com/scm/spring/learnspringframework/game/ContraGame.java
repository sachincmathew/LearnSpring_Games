package com.scm.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("contra")
@Component
public class ContraGame implements Game {

    @Override
    public void up(){
        System.out.println("c_jump");
    }
    @Override
    public void down(){
        System.out.println("c_duck");
    }
    @Override
    public void left(){
        System.out.println("c_left");
    }
    @Override
    public void right(){
        System.out.println("c_right");
    }
}
