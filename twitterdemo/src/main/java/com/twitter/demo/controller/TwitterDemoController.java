package com.twitter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterDemoController {
	@GetMapping("/login")
public String login()
{
	return "Login Successful";
}
}
