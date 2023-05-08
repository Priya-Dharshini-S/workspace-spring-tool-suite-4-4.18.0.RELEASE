package com.book.demo.Service;
import com.book.demo.model.*;
import com.book.demo.Repository.BookLoginRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookLoginService {

@Autowired
private BookLoginRepository brepo;
public String checkLogin(String username,String psword)
{
	BookLoginModel user= brepo.findByUsername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(psword))
		{
			return "Login Succesfull";
		}
		else
		{
			return "Login Failed";
		}
	}
} 
public BookLoginModel addUser(BookLoginModel cl)
{
	return brepo.save(cl);
}
public List<BookLoginModel> getUser()
{
	return brepo.findAll();
}

}
