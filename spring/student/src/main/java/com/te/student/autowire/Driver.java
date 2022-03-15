package com.te.student.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		
		Employee emp =context.getBean(Employee.class);
		
		
		System.out.println(emp);
		
		
		
		
		
	}
}
