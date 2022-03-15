package com.te.medifitapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.te.medifitapp.bean.DietPlan;

@Repository
@JsonDeserialize(as = com.te.medifitapp.bean.MedifitApp.class)
public interface DietDAO extends JpaRepository<DietPlan, Integer>{

}
