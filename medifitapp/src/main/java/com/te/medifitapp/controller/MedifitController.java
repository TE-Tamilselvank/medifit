package com.te.medifitapp.controller;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.ExercisePlans;
//import com.te.ems.bean.UserInfo;
//import com.te.ems.bean.UserResponse;
import com.te.medifitapp.bean.MedifitApp;
import com.te.medifitapp.bean.MedifitResponse;
import com.te.medifitapp.service.MedifitService;

@RestController
//@RequestMapping("/medifitapp")
public class MedifitController {

	@Autowired(required = false)
	private MedifitService service;
	
	@GetMapping("/getData/{userName}")
	public ResponseEntity<MedifitResponse> getData(@PathVariable String userName){
		MedifitResponse response = new MedifitResponse(service.getData(userName),false);
		return new ResponseEntity<MedifitResponse>(response,HttpStatus.OK);
	}

	@PostMapping("/dietregister")
	public ResponseEntity<MedifitResponse> storeDiet(@RequestBody DietPlan plan){
		MedifitResponse response = new MedifitResponse(service.register(plan),false);
		return new ResponseEntity<MedifitResponse>(response,HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<MedifitResponse> storeData(@Valid @RequestBody MedifitApp info) {
		MedifitResponse response = new MedifitResponse(service.register(info), false);
		return new ResponseEntity<MedifitResponse>(response, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<MedifitResponse> getLogin(@RequestBody MedifitApp app) {
		MedifitResponse response = new MedifitResponse(service.login(app.getUserName(), app.getPwd()), false);
		return new ResponseEntity<MedifitResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/plan")
	public ResponseEntity<MedifitResponse> dietPlan(@RequestBody MedifitApp info){
		MedifitResponse response = new MedifitResponse(service.plan(info.getWeight(),info.getHeight()),false);
		return new ResponseEntity<MedifitResponse>(response,HttpStatus.OK);
	}
	
	@PostMapping("/exerciseregister")
	public ResponseEntity<MedifitResponse> exercise(@RequestBody ExercisePlans plan){
		MedifitResponse response = new MedifitResponse(service.exercise(plan),false);
		return new ResponseEntity<MedifitResponse>(response,HttpStatus.OK);
	}
	
	@PostMapping("/exercise")
	public ResponseEntity<MedifitResponse> getPlan(@RequestBody MedifitApp plan){
		MedifitResponse response = new MedifitResponse(service.getPlan(plan.getBmi()),false);
		return new ResponseEntity<MedifitResponse>(response,HttpStatus.OK);
	}
	
	
	
	
	
}
