package com.te.resumebuilder.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.bean.Register;
import com.te.resumebuilder.bean.EducationInfo;
import com.te.resumebuilder.bean.ExperienceDetails;
import com.te.resumebuilder.bean.ExtraDetails;
import com.te.resumebuilder.bean.PersonalDetails;
import com.te.resumebuilder.bean.ProjectDetails;
import com.te.resumebuilder.dao.Education;
import com.te.resumebuilder.dao.Experience;
import com.te.resumebuilder.dao.Extra;
import com.te.resumebuilder.dao.Personal;
import com.te.resumebuilder.dao.Project;
import com.te.resumebuilder.dao.ResumeDAO;
import com.te.resumebuilder.exception.DetailsNotFound;
import com.te.resumebuilder.exception.ResumeException;

@Service
public class ResumeServiceImpl implements ResumeService{

	@Autowired(required = false)
	private Personal per;
	
	@Autowired(required = false)
	private Extra ext;
	
	@Autowired(required = false)
	private Project pro;
	
	@Autowired(required = false)
	private Experience experi;
	
	@Autowired(required = false)
	private Education educa;
	
	@Autowired(required = false)
	private ResumeDAO dao;

	@Override
	@Transactional
	public Register register(Register info) {
		return dao.save(info);
	}
	@Override
	public PersonalDetails getUserId(Integer user_id) {

			if (user_id != null ) {
				Optional<PersonalDetails> details = per.findById(user_id);
				return details.get();
			}
			throw new DetailsNotFound("Details Not Exsist Please Try with valid details");
		}
		
		
	
	@Override
	@Transactional
	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails) {
		return per.save(personalDetails);
	}

	@Override
	@Transactional
	public List<ExperienceDetails> registerExperienceDetails(List<ExperienceDetails> experienceDetails) {
		if (experienceDetails != null && !experienceDetails.isEmpty()) {

			return experi.saveAll(experienceDetails);
		}
		throw new DetailsNotFound("experience Details Not Found");
	}

	@Override
	@Transactional
	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails) {
		if (projectDetails != null && !projectDetails.isEmpty()) {

			return pro.saveAll(projectDetails);
		}
		throw new DetailsNotFound("project Details Not Found");
	}

	@Override
	@Transactional
	public List<ExtraDetails> registerExtraDetails(List<ExtraDetails> extraDetails) {
		if (extraDetails != null && !extraDetails.isEmpty()) {

			return ext.saveAll(extraDetails);
		}
		throw new DetailsNotFound("extra Details Not Found");
	}

	
	@Override
	@Transactional
	public List<EducationInfo> educationRegister(List<EducationInfo> eduinfo) {

			if (eduinfo != null && !eduinfo.isEmpty()) {

				return educa.saveAll(eduinfo);
			}
			throw new DetailsNotFound("User Details Not Found");
		}
	

		@Override
		public Register login(String email, String password) {
			if ((!email.isEmpty() && email != null) && (!password.isEmpty() && password != null)) {
				Register logg = dao.findByMailAndPassword(email, password);
				if (logg != null) {
					return logg;
				} else {
					throw new ResumeException("Invalid Credentials");
				}
			} else {
				throw new ResumeException("Enter valid Login Details");
			}
		}


		
	}

	

