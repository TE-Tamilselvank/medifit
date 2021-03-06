package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.bean.Register;
import com.te.resumebuilder.bean.EducationInfo;
import com.te.resumebuilder.bean.ExperienceDetails;
import com.te.resumebuilder.bean.ExtraDetails;
import com.te.resumebuilder.bean.PersonalDetails;
import com.te.resumebuilder.bean.ProjectDetails;

@Repository
public interface ResumeDAO extends JpaRepository<Register, Integer> {
	
	public Register findByMailAndPassword(String mail,String password);
			
	
}
