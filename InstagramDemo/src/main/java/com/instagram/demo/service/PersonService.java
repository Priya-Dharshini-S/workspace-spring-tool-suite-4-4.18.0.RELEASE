package com.instagram.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.demo.dao.PersonRepository;
import com.instagram.demo.model.Persons;

@Service
public class PersonService {
	@Autowired
	public PersonRepository pr;

public Persons addPerson(Persons name)
{
	return pr.save(name);
}
public List<Persons> getPerson()
{
	return pr.findAll();
}
}
