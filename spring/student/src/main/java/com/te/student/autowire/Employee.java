package com.te.student.autowire;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	private int empId;
	
	private String empName;
	
	@Autowired(required = false)
	@Qualifier("pass")
	private Passport passObj;
}
