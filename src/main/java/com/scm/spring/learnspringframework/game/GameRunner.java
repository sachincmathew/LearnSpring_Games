package com.scm.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private final Game game;//@Autowired in constructor

    @Autowired
    public GameRunner (Game game) {
        this.game = game;
    }

    public void run () {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
