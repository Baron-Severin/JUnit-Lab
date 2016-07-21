package com.genassembly.dotdashdot.animaljunitapp;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by erikrudie on 7/21/16.
 */
public class TestZoo {


//    super(4, 50, false, "Lion");
    @Test
    public void testZoo() throws Exception {
        Zoo zoo = Zoo.getInstance();
        Zoo zoo2 = Zoo.getInstance();
        assertEquals(zoo, zoo2);
    }

    @Test
    public void testFlush() throws Exception {
        Zoo zoo = Zoo.getInstance();
        zoo.flushList();
        ArrayList<Animal> animals = new ArrayList<>();

        assertEquals(animals, zoo.getAnimals());
    }

    @Test
    public void testAdd() throws Exception {
        Zoo zoo = Zoo.getInstance();
        zoo.flushList();
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion = new Lion(true);
        animals.add(lion);
        zoo.addAnimal(lion);

        assertEquals(animals, zoo.getAnimals());
    }

    @Test
    public void testRemove() throws Exception {
        Zoo zoo = Zoo.getInstance();
        zoo.flushList();
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion = new Lion(true);
        animals.add(lion);
        zoo.addAnimal(lion);

        assertEquals(animals, zoo.getAnimals());

        zoo.removeAnimal(lion);
        animals.remove(lion);

        assertEquals(animals, zoo.getAnimals());
    }



}
