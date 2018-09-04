package com.cg.capstore.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.cg.capstore.controller")
@SpringBootApplication
public class CapstoreClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreClientApplication.class, args);
	}
}
