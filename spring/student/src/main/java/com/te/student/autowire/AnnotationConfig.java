package com.te.student.autowire;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Formatter;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {

	@Bean
	public void getEmp() {
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("tamil");
	}
	
	@Bean("pass")
	public void getPass() throws ParseException {
		Passport pass = new Passport();
		
		pass.setPassNum(110);
		
		pass.setDateOfIssue(java.sql.Date.valueOf("11/12/2020"));
		String da="2021/12/12";
		SimpleDateFormat format = new SimpleDateFormat();
		Date date =format.parse(da);
		pass.setDateOfExpiry(date);
		
	}
	
	
}
