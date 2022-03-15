package com.te.student.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
public class Student implements Serializable{

	@Column
	private String name;
	
	@Column
	@Id
	private Integer id;
}
