package com.instagram.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
@Id
private int register;
private String name;
private String department;
private String email;
public int getRegister()
{
	return register;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setRegister(int register) {
	this.register = register;
}

}
