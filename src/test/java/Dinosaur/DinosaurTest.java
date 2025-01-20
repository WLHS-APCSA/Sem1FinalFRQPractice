package Dinosaur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinosaurTest {
    DinosaurKey tommy = new DinosaurKey("T. Rex","Tommy","Carnivore",5,2500);
    //uncomment line below when ready
    //Dinosaur tommy = new Dinosaur("T. Rex","Tommy","Carnivore",5,2500);
    @Test
    void getSpecies() {
        assertEquals("T. Rex",tommy.getSpecies());
    }

    @Test
    void getName() {
        assertEquals("Tommy",tommy.getName());
    }

    @Test
    void getDiet() {
        assertEquals("Carnivore",tommy.getDiet());
    }

    @Test
    void getAge() {
        assertEquals(5,tommy.getAge());
    }

    @Test
    void getWeight() {
        assertEquals(2500.00,tommy.getWeight());
    }

    @Test
    void setName() {
        tommy.setName("Timmy");
        assertEquals("Timmy",tommy.getName());
    }

    @Test
    void setWeight() {
        tommy.setWeight(4964.37);
        assertEquals(4964.37,tommy.getWeight());
    }

    @Test
    void setAge() {
        tommy.setAge(7);
        assertEquals(7,tommy.getAge());
    }

    @Test
    void canEat() {
        assertTrue(tommy.canEat("Hippo","Meat"));
        assertFalse(tommy.canEat("Grass","Plant"));

    }

}