package com.te.medifitapp.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class ExercisePlans implements Serializable{

	@Id
	private Integer id;
	
	private String description;
	
	private String plan1;
	
	private String plan2;
	
	private String plan3;
	
	private String plan4;
	

	
	
}
