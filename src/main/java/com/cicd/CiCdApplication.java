package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
public class CiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
	}

	public Map<String, String> health() {
		return Map.of("Status", "UP");
	}
}
