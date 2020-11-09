package com.example.demo;


import implem.Fact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactTest {
    @Test
    public void factorialZero() {
        Fact f = new Fact();
        int expected = 1;
        long actual = f.factorialUsingForLoop(0);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialOne() {
        Fact f = new Fact();
        int expected = 1;
        long actual = f.factorialUsingForLoop(1);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTwo() {
        Fact f = new Fact();
        int expected = 1;
        long actual = f.factorialUsingForLoop(2);
        assertEquals(expected, actual);
    }


    @Test
    public void factorialFive() {
        Fact f = new Fact();
        int expected = 1;
        long actual = f.factorialUsingForLoop(5);
        assertEquals(expected, actual);
    }

}
