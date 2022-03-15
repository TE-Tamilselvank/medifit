package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.bean.ExperienceDetails;

public interface Experience extends JpaRepository<ExperienceDetails, Integer>{

}
