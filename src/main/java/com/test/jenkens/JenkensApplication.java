package com.test.jenkens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkensApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkensApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return " hi there added here";
	}
}
