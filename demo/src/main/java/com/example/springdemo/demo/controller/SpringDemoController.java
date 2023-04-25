package com.example.springdemo.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {
	
	@GetMapping("/login")
public String welcome()
{
	return "WELCOME";
}
}
