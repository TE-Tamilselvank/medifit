package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.bean.ExtraDetails;

public interface Extra extends JpaRepository<ExtraDetails, Integer>{

}
