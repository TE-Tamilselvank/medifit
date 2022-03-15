package com.te.medifitapp.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;

import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.ExercisePlans;
import com.te.medifitapp.bean.MedifitApp;

public interface MedifitService {

	public MedifitApp register(MedifitApp info);

	public MedifitApp login(String userName, String pwd);

	public DietPlan register(DietPlan plan);

	public Optional<DietPlan> plan(Integer weight, Integer height);

	public ExercisePlans exercise(ExercisePlans plan);

	public Optional<ExercisePlans> getPlan(Integer bmi);

	public MedifitApp getData(String userName);




}
