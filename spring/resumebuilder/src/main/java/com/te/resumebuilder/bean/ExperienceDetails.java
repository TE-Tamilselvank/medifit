package com.te.resumebuilder.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "experience_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExperienceDetails implements Serializable {

	@Id
	@Column
	private String email;

	@Column
	private Integer user_id;

	@Column
	private String institution_organisation;

	@Column
	private String position;

	@Column
	private String duration;

	@Column
	private String description;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id",insertable = false,updatable = false)
	private PersonalDetails personexp;

}
