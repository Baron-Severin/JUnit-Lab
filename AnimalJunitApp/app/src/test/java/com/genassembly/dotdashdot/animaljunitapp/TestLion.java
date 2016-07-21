package com.genassembly.dotdashdot.animaljunitapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by erikrudie on 7/21/16.
 */
public class TestLion {


//    super(4, 50, false, "Lion");
    @Test
    public void lionCreated() throws Exception {
        Lion lion = new Lion(false);

        int legs = 4;
        int topSpeed = 50;
        String sound = "Roar!!!";
        String name = "Lion";
        boolean isAlpha = false;

        assertEquals(topSpeed, lion.getTopSpeed());
        assertEquals(sound, lion.makeNoise());
        assertEquals(legs, lion.getNumLegs());
        assertEquals(name, lion.getName());
        assertEquals(isAlpha, lion.isAlpha());
    }

}
