package com.scm.spring.learnspringframework.game;

public class MarioGame implements Game {

    @Override
    public void up(){
            System.out.println("m_jump");
        }
    @Override
    public void down(){
            System.out.println("m_duck");
        }
    @Override
    public void left(){
            System.out.println("m_left");
        }
    @Override
    public void right(){
            System.out.println("m_right");
        }

}
