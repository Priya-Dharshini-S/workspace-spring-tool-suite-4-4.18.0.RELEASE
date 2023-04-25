package com.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramDemo {
	@GetMapping("/getPost")
public String getPost(@RequestParam String username)
{
	return "The post of "+username;	
}
}
