package com.genassembly.dotdashdot.animaljunitapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by erikrudie on 7/21/16.
 */
public class TestSnake {


//    super(false,5,false,"Snake");
    @Test
    public void snakeCreated() throws Exception {
        Snake snake = new Snake(false);

        boolean hasShell = false;
        int topSpeed = 5;
        String sound = "Hiss!!!";
        String name = "Snake";

        assertEquals(topSpeed, snake.getTopSpeed());
        assertEquals(sound, snake.makeNoise());
        assertEquals(hasShell, snake.getHasShell());
        assertEquals(name, snake.getName());
    }

}
