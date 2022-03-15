package com.te.medifitapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class DietPlan implements Serializable {

	@Id
	private Integer id;
	
	@Column
	private String wheyProtein;
	
	@Column
	private String breakfast;
	
	@Column
	private String lunch;
	
	@Column
	private String dinner;
	
	
	
}
