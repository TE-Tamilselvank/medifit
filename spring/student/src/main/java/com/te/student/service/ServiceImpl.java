package com.te.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.student.bean.Student;
import com.te.student.dao.StudentDAO;

@Service
public class ServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;

	@Override
	public Student getReg(Student student) {
		Student st= dao.save(student);
		 return st;
	}

	@Override
	public Student getId(Integer id) {
		Student st=dao.findById(id).get();
		return st;
	}

	@Override
	public void getDelete(Integer id) {

		dao.deleteById(id);
	}

//	@Override
//	public Student getUpdate(Integer id) {
//	Student st=	dao.
//		return st;
//	}

		
		
	
}
