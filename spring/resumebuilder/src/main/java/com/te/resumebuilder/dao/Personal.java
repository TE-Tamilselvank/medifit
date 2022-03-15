package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.bean.PersonalDetails;

public interface Personal extends JpaRepository<PersonalDetails, Integer>{

}
