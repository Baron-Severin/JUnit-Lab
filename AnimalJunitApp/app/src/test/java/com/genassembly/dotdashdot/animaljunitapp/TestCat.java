package com.genassembly.dotdashdot.animaljunitapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by erikrudie on 7/21/16.
 */
public class TestCat {



    @Test
    public void catCreated() throws Exception {
        Cat cat = new Cat();

        int topSpeed = 15;
        String sound = "Meow!!!";

        assertEquals(topSpeed, cat.getTopSpeed());
        assertEquals(sound, cat.makeNoise());
    }

}
