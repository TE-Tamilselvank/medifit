package com.te.resumebuilder.service;

import com.te.resumebuilder.bean.Register;

import java.util.List;

import com.te.resumebuilder.bean.EducationInfo;
import com.te.resumebuilder.bean.ExperienceDetails;
import com.te.resumebuilder.bean.ExtraDetails;
import com.te.resumebuilder.bean.PersonalDetails;
import com.te.resumebuilder.bean.ProjectDetails;

public interface ResumeService {

	public Register register (Register info);
	
	public Register login(String email, String password);
	
	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails);
	
	public List<ExperienceDetails> registerExperienceDetails(List<ExperienceDetails> experienceDetails);
	
	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails);
	
	public List<ExtraDetails> registerExtraDetails(List<ExtraDetails> extraDetails);

	public List<EducationInfo> educationRegister(List<EducationInfo> eduinfo);

	public PersonalDetails getUserId(Integer user_id);
}
