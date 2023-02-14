package com.google_Auth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleAuthApplication {
	@GetMapping
	public String welcome() {
		return"welcome to google";
	}
	
	
	@GetMapping("/user")
	public Principal user(Principal principle) {
		
		System.out.println("username:"+ principle.getName());
		return principle;
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(GoogleAuthApplication.class, args);
	}

}
