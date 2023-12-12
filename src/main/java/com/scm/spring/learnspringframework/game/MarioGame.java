package com.scm.spring.learnspringframework.game;

public class MarioGame implements Game {

        public void up(){
            System.out.println("m_jump");
        }
        public void down(){
            System.out.println("m_duck");
        }
        public void left(){
            System.out.println("m_left");
        }
        public void right(){
            System.out.println("m_right");
        }

}
