package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
class ControllerApp {

    @GetMapping("/metrics/")
    public  long getMemory() {
         //return  Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
       return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
