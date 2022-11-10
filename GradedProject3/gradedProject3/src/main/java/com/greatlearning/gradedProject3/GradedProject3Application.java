package com.greatlearning.gradedProject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class GradedProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(GradedProject3Application.class, args);
	}

}
