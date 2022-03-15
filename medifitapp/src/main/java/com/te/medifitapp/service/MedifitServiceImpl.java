package com.te.medifitapp.service;

import java.util.Optional;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.ExercisePlans;
import com.te.medifitapp.bean.MedifitApp;
import com.te.medifitapp.dao.DietDAO;
import com.te.medifitapp.dao.ExerciseDAO;
import com.te.medifitapp.dao.MedifitDAO;
import com.te.medifitapp.exception.ExercisePlanException;
import com.te.medifitapp.exception.UserNotFoundException;

@Service
public class MedifitServiceImpl implements MedifitService{

	@Autowired
	private MedifitDAO dao;
	
	@Autowired
	private DietDAO diet;
	
	@Autowired
	private ExerciseDAO exer;
	

	@Override
	public MedifitApp register(MedifitApp info) {
		return dao.save(info);
	}

	@Override
	public MedifitApp login(String userName, String pwd) {
		if ((userName != null && !userName.isEmpty()) && (pwd != null && !pwd.isEmpty())) {
			
		MedifitApp medi =dao.findByUserNameAndPwd(userName,pwd);
		if (medi != null) {
			return medi;
		}else {
			throw new UserNotFoundException("User not found");
		}
		}
		throw new UserNotFoundException("Something went wrong");
	}

	@Override
	public DietPlan register(DietPlan plan) {
		return diet.save(plan);
	}

	@Override
	public Optional<DietPlan> plan(Integer weight, Integer height) {

		Optional<DietPlan> low = diet.findById(200);

		if (weight < 50 && height < 160) {
//		DietPlan dp = diet.getById(100);
		Optional<DietPlan> high = diet.findById(100);
		return high;
		}
		return low;
	}

	@Override
	public ExercisePlans exercise(ExercisePlans plan) {
		return exer.save(plan);
	}

	@Override
	public Optional<ExercisePlans> getPlan(Integer bmi) {
		if (bmi>=18 && bmi<=25) {
		Optional<ExercisePlans> pl = exer.findById(2200);
		return pl;
		}else if (bmi>=26 && bmi<=30) {
			Optional<ExercisePlans> ph = exer.findById(1100);
			return ph;
		}
		throw new ExercisePlanException("we don't have plan for you right now");
		
		
	
	}

	@Override
	public MedifitApp getData(String userName) {
		return dao.findByuserName(userName);
	}

	
	
	
	

	}
	

