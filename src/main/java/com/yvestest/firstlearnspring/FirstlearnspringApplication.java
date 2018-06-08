package com.yvestest.firstlearnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FirstlearnspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstlearnspringApplication.class, args);
	}
}
