package com.scm.spring.learnspringframework;

import com.scm.spring.learnspringframework.game.ContraGame;
import com.scm.spring.learnspringframework.game.GameRunner;
import com.scm.spring.learnspringframework.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main (String[] args) {

        //SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();

        ContraGame contraGame = new ContraGame();
        GameRunner gameRunner2 = new GameRunner(contraGame);
        gameRunner2.run();

    }

}
