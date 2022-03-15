package com.te.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.crud.bean.Employee;


public interface EmployeeDAO extends JpaRepository<Employee, Integer>  {

	

}
