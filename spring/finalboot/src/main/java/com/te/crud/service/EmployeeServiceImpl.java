package com.te.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.bean.Employee;
import com.te.crud.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired(required = false)
	private EmployeeDAO dao;

	@Override
	public Employee getReg(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee getUser(Integer id) {
		Employee employee= dao.getById(id);
		return employee;
	}
	
}
