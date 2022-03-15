package com.te.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.student.bean.Student;
import com.te.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired(required = false)
	private StudentService service;
	
	@PostMapping("/register")
	public ResponseEntity<Student> getReg(@RequestBody Student student){
		Student std =service.getReg(student);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getId(@PathVariable Integer id){
		Student std=service.getId(id);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Student> getDelete(@PathVariable Integer id){
		service.getDelete(id);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public  ResponseEntity<Student> getUpdate(@RequestBody Student student){
		Student std=service.getReg(student);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
			
	}
	

	
}
