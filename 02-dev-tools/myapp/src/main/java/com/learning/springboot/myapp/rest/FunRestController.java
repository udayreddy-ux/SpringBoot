package com.learning.springboot.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!!";
	}
	@GetMapping("/Home")
	public String sayHome() {
		return "This is home!!";
	}
}