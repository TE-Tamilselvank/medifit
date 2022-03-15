package com.te.medifitapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class MedifitApp implements Serializable{

	@Column
	@NotNull(message = "Name should not be null")
	@NotEmpty(message = "Name should not be empty")
	private String name;
	
	@Id
	@Column
	private String userName;
	
	@Column
	@Min(value = 10l,message = "Enter the valid mobile number")
	private String mobile;
	
	@Column
	@NotNull(message = "mail should not be null")
	@NotEmpty(message = "mail should not be empty")
	private String mail;
	
	@Column
	private Integer weight;
	
	@Column
	private Integer height;
	
	@Column
	@NotNull(message = "gender should not be null")
	@NotEmpty(message = "gender should not be empty")
	private String gender;
	
	@Column
	private String city;
	
	@Column
	@Min(value =18,message = "age should not be less than 18" )
	@Max(value =70,message = "age should not be greater than 70" )
	private Integer age;
	
	@Column
	@NotNull(message = "password should not be null")
	@NotEmpty(message = "password should not be empty")
	private String pwd;

	@Column
	@Min(value =20,message = "BMI should not be less than 20" )
	@Max(value =45,message = "BMI should not be greater than 45" )
	@NotNull(message = "BMI should not be null")
	@NotEmpty(message = "BMI should not be empty")
	private Integer bmi;
}
