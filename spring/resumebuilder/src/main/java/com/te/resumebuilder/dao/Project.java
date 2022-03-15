package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.bean.ProjectDetails;

public interface Project extends  JpaRepository<ProjectDetails, Integer>{

}
