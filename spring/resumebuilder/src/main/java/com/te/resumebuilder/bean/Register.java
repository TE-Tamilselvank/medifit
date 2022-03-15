package com.te.resumebuilder.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="register")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Register implements Serializable{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	
	@Column
	@NotNull(message = "Name should not be null")
	@NotEmpty(message = "Name should not be empty")
	private String name;
	
	@Column
	@Min(value = 10l,message = "Enter the valid mobile number")
	private Long mobile;

	
	@Column
	@NotNull(message = "mail should not be null")
	@NotEmpty(message = "mail should not be empty")
	private String mail;

	@Column
	@NotNull(message = "password should not be null")
	@NotEmpty(message = "password should not be empty")
	private String password;
}
