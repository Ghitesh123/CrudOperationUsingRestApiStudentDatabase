package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;

import com.demo.studserviceimpl.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	private StudentService service;

@PostMapping(value="/student")
public Student saveStudent(@RequestBody Student std) {
System.out.println("hi this is hitesh");
Student s1=	service.saveStudent(std);
System.out.println(s1);
	return s1;

}

@GetMapping(value = "/student/{id}")
public Student getStudent(@PathVariable(value = "id") int id) {
	Student s=service.getSudent(id);
	return s;
}
	

@DeleteMapping(value="/student/{id}")
public void deleteStudent(@PathVariable(value = "id") int id) {

	service.deleteStudent(id);
	
}

@GetMapping(value="/student")
public List<Student> getAllStudent(){
	List<Student> li=service.getAllStudent();

	return li;
}

@PutMapping(value = "/student/{id}")
public Student updateStudent(@RequestBody Student s,@PathVariable(value = "id") int id) {
	Student s4=service.getSudent(id);
	s4.setAddress(s.getAddress());
	s4.setName(s.getName());
	s4.setMobileno(s.getMobileno());
	service.saveStudent(s4);
	return s4;
}

}



