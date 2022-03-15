package com.te.medifitapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.MedifitApp;

@Repository
public interface MedifitDAO extends JpaRepository<MedifitApp, Integer>{

	public MedifitApp findByUserNameAndPwd(String userName, String pwd);

	public MedifitApp findByuserName(String userName);

	//public DietPlan save(DietPlan plan);

}
