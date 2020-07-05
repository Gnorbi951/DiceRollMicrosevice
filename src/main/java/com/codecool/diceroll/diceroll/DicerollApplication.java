package com.codecool.diceroll.diceroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class DicerollApplication {

	public static void main(String[] args) {
		SpringApplication.run(DicerollApplication.class, args);
	}
	@Bean
	public Random random() {
		return new Random();
	}
}
