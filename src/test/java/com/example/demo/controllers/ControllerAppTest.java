package com.example.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerAppTest {

    @Test
    void getFact() {
        ControllerApp controller = new ControllerApp();
        long response = controller.getFact(5);
        assertEquals(120,response);
    }
}