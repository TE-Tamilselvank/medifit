package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.bean.EducationInfo;

public interface Education extends JpaRepository<EducationInfo, Integer>{

}
