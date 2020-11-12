package com.example.demo.controllers;

import implem.Fact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public
class ControllerApp {

    @GetMapping("/metrics/")
    public  long getMemory() {
       return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
    @GetMapping("/")
    public long getFact(@RequestParam int fact){
        Fact factoriel = new Fact();
        return  factoriel.factorialUsingForLoop(fact);
    }
    @GetMapping("/Fact")
    public long getFact2(@RequestParam int fact){
        Fact factoriel = new Fact();
        return  factoriel.factorialUsingRecursion(fact);
    }

}
