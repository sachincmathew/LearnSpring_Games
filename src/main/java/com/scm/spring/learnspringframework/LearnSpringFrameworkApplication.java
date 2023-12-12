package com.scm.spring.learnspringframework;

import com.scm.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main (String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

//        Game game = new PacmanGame();
//        GameRunner gameRunner = new GameRunner(game);

        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();

    }

}
