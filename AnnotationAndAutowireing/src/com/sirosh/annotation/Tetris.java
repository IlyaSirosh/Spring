package com.sirosh.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by Illya on 14.02.17.
 */

@Component
public class Tetris implements Game {
    public void play() {
        System.out.println("tetris");
    }
}
