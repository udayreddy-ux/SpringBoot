package com.learning.springboot.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//injecting properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	//expose new endpoint for "teamInfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: "+coachName+", Team name: " + teamName;
	}
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!!";
	}
	@GetMapping("/Home")
	public String sayHome() {
		return "This is home!!";
	}
	
}
