package com.te.student.service;

import org.springframework.stereotype.Service;

import com.te.student.bean.Student;


public interface StudentService {

	public Student getReg(Student student);

	public Student getId(Integer id);

	public void getDelete(Integer id);

}
