package com.instagram.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.demo.dao.StudentRepository;
import com.instagram.demo.model.Student;

@Service
public class StudentService {
	@Autowired
StudentRepository studRepository;

public List<Student>getAllStudents()
{
	List<Student>studList=studRepository.findAll();
	return studList;
}

public Student saveStudent(Student s) {
	
	Student obj=studRepository.save(s);
	return obj;
}
public Student updateStudent(Student s) {
	
	Student obj=studRepository.save(s);
	return obj;
}
public void deleteStudent(int register)
{
	studRepository.deleteById(register);
}
public Student getStudent(int register) {
	Student s=studRepository.findById(register).get();
	return s;
	
}
}