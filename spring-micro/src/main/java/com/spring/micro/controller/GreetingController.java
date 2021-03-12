package com.spring.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/greet")
	public String getGreeting() throws Exception {
		return "hello";
	}

}
