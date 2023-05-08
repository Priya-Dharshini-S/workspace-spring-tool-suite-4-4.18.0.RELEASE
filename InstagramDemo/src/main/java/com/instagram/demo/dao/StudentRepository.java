package com.instagram.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.instagram.demo.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer>
{
	//positional parameters
	@Query("select s from Student s where s.department=?1 and s.name=?2")
	public List<Student>getStudentsByDepartment(String department,String name);
	//named parameter
	@Query("select s from Student s where s.department=:department")
	public List<Student>getStudentsByDepartment(String department);
	//DML
	@Modifying
	@Query("delete from Student s where s.name=?1")
    public int deleteStudentByName(String name);
@Modifying
@Query("update Student s set s.department=?1 where s.name=?2 ")
 int updateStudent(String department,String name);

@Query(value="select*from Student s where s.email=?1",nativeQuery=true)
	public List<Student>fetchStudentByEmail(String email);
	
	List <Student>findByNameStartingWith(String prefix);
   
	List <Student>findByDepartment(String department);
    List <Student>findByNameEndingWith(String suffix);
	
}