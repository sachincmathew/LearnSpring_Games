package com.scm.spring.learnspringframework.game;

public class ContraGame implements Game {

    public void up(){
        System.out.println("c_jump");
    }
    public void down(){
        System.out.println("c_duck");
    }
    public void left(){
        System.out.println("c_left");
    }
    public void right(){
        System.out.println("c_right");
    }
}
