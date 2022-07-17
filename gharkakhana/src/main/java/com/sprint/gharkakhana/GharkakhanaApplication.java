package com.sprint.gharkakhana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
@SpringBootConfiguration
@AutoConfiguration
public class GharkakhanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GharkakhanaApplication.class, args);
		System.out.println("It's running");
	}

}

