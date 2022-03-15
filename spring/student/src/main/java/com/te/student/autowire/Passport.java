package com.te.student.autowire;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Passport implements Serializable{

	private int passNum;
	
	//@Value("${new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"${PROP_DATE}\")}")
	private java.sql.Date dateOfIssue;
	
	
	//@Value("${new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"${PROP_DATE}\")}")
	//@Value("#{T(java.util.Date)}")
	//@Value("#{new java.text.SimpleDateFormat('${date.of.joining.format}').parse('${date.of.joining.format}')}")
	private Date dateOfExpiry;
	
	
}
