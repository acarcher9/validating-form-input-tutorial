package com.example.validatingforminput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// the annotation below is all you need (instead of @EnableWebMvc) because Spring Boot already adds this annotation. Thymeleaf config is taken care of as well.
@SpringBootApplication
public class ValidatingFormInputApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ValidatingFormInputApplication.class, args);
	}

}
