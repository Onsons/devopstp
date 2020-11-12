package com.example.demo;


import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TpDevopsApplication {

	public static void main(String[] args) throws IOException, RunnerException {
		SpringApplication.run(TpDevopsApplication.class, args);

	}

}
