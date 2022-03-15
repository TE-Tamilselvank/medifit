package com.te.resumebuilder.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.bean.EducationInfo;
import com.te.resumebuilder.bean.ExperienceDetails;
import com.te.resumebuilder.bean.ExtraDetails;
import com.te.resumebuilder.bean.PersonalDetails;
import com.te.resumebuilder.bean.ProjectDetails;
import com.te.resumebuilder.bean.Register;
import com.te.resumebuilder.bean.ResumeResponse;
import com.te.resumebuilder.bean.EducationInfo;
import com.te.resumebuilder.service.ResumeService;

@RestController
public class ResumeController {
	
	@Autowired
	private ResumeService service;
	
	@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, customDateEditor);
	}

	@GetMapping("/userInfo/{user_id}")
	public ResponseEntity<ResumeResponse> getUSer(@Valid @PathVariable Integer user_id ) {

		PersonalDetails details = service.getUserId(user_id);
		ResumeResponse response = new ResumeResponse(false, details);
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	
	@PostMapping(path = "/register")
	public ResponseEntity<ResumeResponse> storeData(@Valid @RequestBody Register info){
		ResumeResponse response = new ResumeResponse(false, service.register(info));
		return new ResponseEntity<ResumeResponse>(response,HttpStatus.OK);
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<ResumeResponse> login(@Valid @RequestBody Register login){
		ResumeResponse response=new ResumeResponse(false,service.login(login.getMail(),login.getPassword()));
		return new ResponseEntity<ResumeResponse>(response,HttpStatus.OK);
	}
	@PostMapping(path = "/educationdetails")
	public ResponseEntity<ResumeResponse> storeData(@Valid @RequestBody List<EducationInfo> info) {
		ResumeResponse response = new ResumeResponse(false, service.educationRegister(info));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/personal")
	public ResponseEntity<ResumeResponse> storeDataPersonal(@Valid @RequestBody PersonalDetails personalinfo) {
		ResumeResponse response = new ResumeResponse(false, service.registerPersonalDetails(personalinfo));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/experience")
	public ResponseEntity<ResumeResponse> storeDataExperience(@Valid @RequestBody List<ExperienceDetails> experienceinfo) {
		ResumeResponse response = new ResumeResponse(false, service.registerExperienceDetails(experienceinfo));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/project")
	public ResponseEntity<ResumeResponse> storeDataProject(@Valid @RequestBody List<ProjectDetails> projectDetails) {
		ResumeResponse response = new ResumeResponse(false, service.registerProjectDetails( projectDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/extra")
	public ResponseEntity<ResumeResponse> storeDataExtra(@Valid @RequestBody List<ExtraDetails> extraDetails) {
		ResumeResponse response = new ResumeResponse(false, service.registerExtraDetails( extraDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	
	}
}
