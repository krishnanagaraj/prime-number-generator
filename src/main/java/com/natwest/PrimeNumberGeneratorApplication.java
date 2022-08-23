package com.natwest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PrimeNumberGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumberGeneratorApplication.class, args);
	}
}
