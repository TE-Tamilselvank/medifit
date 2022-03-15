package com.te.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.crud.bean.Employee;
import com.te.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired(required = false)
	private EmployeeService service;
	
	@PostMapping("/register")
	public ResponseEntity<Employee> getReg(@RequestBody Employee emp){
		
		Employee employee=service.getReg(emp);
		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getUser(@PathVariable Integer id){
		Employee employee=service.getUser(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
}
