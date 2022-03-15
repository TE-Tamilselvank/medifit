package com.te.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.student.bean.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{

}
