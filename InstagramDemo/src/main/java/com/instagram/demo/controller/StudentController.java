package com.instagram.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.demo.model.Student;
import com.instagram.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired
	StudentService studService;

@GetMapping(value="/fetchStudents")

public List<Student>getAllStudent()
{
	List<Student>studList=studService.getAllStudents();
	return studList;
}
//http://localhost:8080/saveStudent
	
@PostMapping(value="/saveStudent")
public Student saveStudent(@RequestBody Student s)
{
	return studService.saveStudent(s);
}
@PutMapping(value="/updateStudent/{register}")
public Student updateStudent(@RequestBody Student s,@PathVariable int register)
{
	return studService.updateStudent(s,register);
}

@DeleteMapping(value="/deleteStudent/{register}")
public void deleteStudent(@PathVariable("register") int register)
{
	 studService.deleteStudent(register);
}
@GetMapping(value="/getStudent/{register}")
public Student getStudent(@PathVariable("register") int register)
{
	return studService.getStudent(register);
}

@GetMapping("/sortStudents/{field}")
public List<Student> sortStudents(@PathVariable String field)
{
	 return studService.sortStudents(field);

}
@GetMapping("/paging/{offset}/{pageSize}")
public Page<Student>pagingStudents(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return studService.pagingStudents(offset, pageSize);
}
@GetMapping("/pagingAndSorting/{offset}/{pageSize}/{field}")
public List<Student>pagingAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize,@PathVariable("field") String field)
{
	return studService.pagingAndSorting(offset, pageSize,field);
}
@GetMapping("/fetchStudentByNamePrefix")
public List<Student>fetchStudentsByNamePrefix(@RequestParam String prefix)
{
	return studService.fetchStudentsByNamePrefix(prefix);
}
@GetMapping("/fetchStudentByNameSuffix")
public List<Student>fetchStudentsByNameSuffix(@RequestParam String suffix)
{
	return studService.fetchStudentsByNameSuffix(suffix);
}
@GetMapping("/getStudentByDepartment/{department}/{name}")
public List<Student>fetchStudentsByDepartment(@PathVariable String department,@PathVariable String name)
{
	return studService.getStudentsByDepartment(department,name);
}
@DeleteMapping("/deletebyquery/{name}")
public String deleteStudentByName(@PathVariable("name") String name)
{
	int result=studService.deleteStudentByName(name);
	if(result>0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
}
@PutMapping("/updatebyquery/{department}/{name}")
public String updateStudent(@PathVariable ("department")String department,@PathVariable ("name")String name)
{
	int result= studService.updateStudent(department,name);
	if(result>0)
		return "Student record updated";
	else
		return "Problem occured while updating";
	
	
}
@GetMapping("fetchbymail/{email}")
public List<Student> fetchStudentByEmail(@PathVariable String email){
	return studService.fetchStudentByEmail(email);
}
}
