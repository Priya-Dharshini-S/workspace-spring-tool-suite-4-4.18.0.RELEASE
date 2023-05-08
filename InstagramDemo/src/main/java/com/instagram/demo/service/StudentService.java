package com.instagram.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.instagram.demo.dao.StudentRepository;
import com.instagram.demo.model.Student;

import jakarta.transaction.Transactional;



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
public Student updateStudent(Student s,int register) {
	Optional<Student>optional= studRepository.findById(register);
	Student obj=null;
	if(optional.isPresent())
	{
		obj=optional.get();
		
		studRepository.save(s);
	}
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
public List<Student>sortStudents(String field)
{
	//return studRepository.findAll(Sort.by(field));
	return studRepository.findAll(Sort.by(Direction.DESC,field));
	
}
public Page<Student> pagingStudents(int offset,int pageSize)
{
	Pageable paging=PageRequest.of(offset,pageSize);
	Page<Student>studData=studRepository.findAll(paging);
	//List<Student>studList=studData.getContent();
    return studData;
}
public List<Student>pagingAndSorting(int offset,int pageSize,String field)
{
	Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
	Page<Student>stud=studRepository.findAll(paging);
	return stud.getContent();
}

public List<Student> fetchStudentsByNamePrefix(String prefix)
{
	  return studRepository.findByNameStartingWith(prefix);
}
public List<Student> fetchStudentsByNameSuffix(String suffix)
{
	  return studRepository.findByNameEndingWith(suffix);
}
public List<Student> getStudentsByDepartment(String department,String name)
{
	  return studRepository.getStudentsByDepartment(department,name);
	  
}

@Transactional
public int deleteStudentByName(String name)
{
	return studRepository.deleteStudentByName(name);
	
}
@Transactional
public int updateStudent(String department,String name)
{
	return studRepository.updateStudent(department, name);
}
@Transactional
public List<Student> fetchStudentByEmail(String email)
{
	return studRepository.fetchStudentByEmail(email);
}
}