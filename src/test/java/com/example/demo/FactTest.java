package com.example.demo;

import implem.Fact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactTest {

    @Test
    void factorialUsingForLoop() {
        Fact fact = new Fact();
        long response = fact.factorialUsingForLoop(0);
        assertEquals(1,response);

        Fact fact1 = new Fact();
        long response1 = fact.factorialUsingForLoop(1);
        assertEquals(1,response1);

        Fact fact2 = new Fact();
        long response2 = fact.factorialUsingForLoop(2);
        assertEquals(2,response2);

        Fact fact3 = new Fact();
        long response3 = fact.factorialUsingForLoop(5);
        assertEquals(120,response3);
    }

    @Test
    void factorialUsingRecursion() {
        Fact fact4 = new Fact();
        long response3 = fact4.factorialUsingRecursion(5);
        assertEquals(120,response3);
    }
}