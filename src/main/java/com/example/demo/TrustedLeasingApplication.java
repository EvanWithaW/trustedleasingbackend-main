package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.example.demo.models")
public class TrustedLeasingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrustedLeasingApplication.class, args);
	}

}
