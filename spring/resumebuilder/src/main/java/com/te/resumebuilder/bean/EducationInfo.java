package com.te.resumebuilder.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table
public class EducationInfo implements Serializable{
	
	@Id
	@Column
	private String email;

	@Column
	private Integer user_id;
	
	@Column
	private String college_university;
	
	@Column
	private String qualification_college;
	
	@Column
	private Date doj_c;
	
	@Column
	private Date doc_c;
	
	@Column
	private String description_college;
	
	@Column
	private String school_name;
	
	@Column
	private String qualification_school;
	
	@Column
	private Date doj_s;
	
	@Column
	private Date doc_s;
	
	@Column
	private String description_school;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id",insertable = false,updatable = false)
	private PersonalDetails educational;
}
