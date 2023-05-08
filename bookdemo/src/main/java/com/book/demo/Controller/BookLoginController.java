package com.book.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.demo.model.BookLoginModel;
import com.book.demo.Service.BookLoginService;
@RestController
@RequestMapping("/user")
public class BookLoginController {
	
	@Autowired
	private BookLoginService bser;
	
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=bser.checkLogin(username,password);
		return result;
	}
	
	@PostMapping("/adduser")
	public BookLoginModel AddUser(@RequestBody BookLoginModel cl)
	{
		return bser.addUser(cl);
	}
	
	@GetMapping("/showall")
	public List<BookLoginModel> listAll()
	{
		return bser.getUser();
	}
}
