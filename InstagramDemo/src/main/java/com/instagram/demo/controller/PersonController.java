package com.instagram.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.demo.model.Persons;
import com.instagram.demo.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	public PersonService ps;
	
	@PostMapping("/postperson")
	public Persons add(@RequestBody Persons name)
	{
		return ps.addPerson(name);
	}
	@GetMapping("/getperson")
	public List<Persons> getPersons()
	{
		return ps.getPerson();
	}
	
//@GetMapping("getbyid/{id}")
//	public Optional<Persons>getusingid(int id)
//	{
//		return ps.getusingid(id);
//	}
}
