package com.te.crud.bean;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
public class Employee implements Serializable{

	
	private String name;
	
	private Integer id;
}
