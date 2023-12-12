package com.scm.spring.learnspringframework;

import com.scm.spring.learnspringframework.game.Game;

public class PacmanGame implements Game {
    @Override
    public void up(){
        System.out.println("p_jump");
    }
    @Override
    public void down(){
        System.out.println("p_duck");
    }
    @Override
    public void left(){
        System.out.println("p_left");
    }
    @Override
    public void right(){
        System.out.println("p_right");
    }
}
