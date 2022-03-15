package com.te.crud.bean;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_final")
public class Employee {

	
	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String role;
	

}
