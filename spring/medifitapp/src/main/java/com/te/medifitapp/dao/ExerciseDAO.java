package com.te.medifitapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.medifitapp.bean.ExercisePlans;

@Repository
public interface ExerciseDAO extends JpaRepository<ExercisePlans, Integer>{

	
	
	
}
