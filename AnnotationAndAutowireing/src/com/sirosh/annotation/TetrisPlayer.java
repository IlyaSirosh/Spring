package com.sirosh.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Illya on 14.02.17.
 */

@Component
public class TetrisPlayer implements Gamer {

    @Autowired
    private Game game;

    public void play(){
        System.out.print("playing... ");
        game.play();
    }
}
