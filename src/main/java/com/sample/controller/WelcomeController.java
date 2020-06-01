package com.sample.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",maxAge=3600)
public class WelcomeController {
	
	@GetMapping("welcome")
	public String helloFunction() {
		return "Welcome to EC2 instance";
	}
}
