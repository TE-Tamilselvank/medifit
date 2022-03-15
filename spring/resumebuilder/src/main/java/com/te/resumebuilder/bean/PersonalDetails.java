package com.te.resumebuilder.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "personal_details")

public class PersonalDetails implements Serializable {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;

	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private String email;

	@Column
	private Long phone_number;

	@Column
	private String website;

	@Column
	private String git_hub;

	@Column
	private String linkedin;

	@Column
	private String twitter;

	@Column
	private String facebook;

	@Column
	private String instagram;
	
	@OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
	private List<ExtraDetails> extra;
	
	@OneToMany(mappedBy = "educational",fetch = FetchType.LAZY)
	private List<EducationInfo> education;

	@OneToMany(mappedBy = "personexp",fetch = FetchType.LAZY)
	private List<ExperienceDetails> experience;

	@OneToMany(mappedBy = "details",fetch = FetchType.LAZY)
	private List<ProjectDetails> project;

	
		
}
