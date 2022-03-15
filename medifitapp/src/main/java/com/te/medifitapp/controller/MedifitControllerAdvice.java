package com.te.medifitapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.medifitapp.bean.MedifitResponse;
import com.te.medifitapp.exception.ExercisePlanException;
import com.te.medifitapp.exception.UserNotFoundException;

@RestControllerAdvice
public class MedifitControllerAdvice {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MedifitResponse> UserNotValidException(UserNotFoundException exp){
		MedifitResponse res = new MedifitResponse(exp.getMessage(),true);
		return new ResponseEntity<MedifitResponse>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MedifitResponse> methodArgumentNotValidException(MethodArgumentNotValidException exp){
		MedifitResponse res = new MedifitResponse(exp.getFieldError().getDefaultMessage(),true);
		return new ResponseEntity<MedifitResponse>(res,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ExercisePlanException.class)
	public ResponseEntity<MedifitResponse> NotValidException(ExercisePlanException exp){
		MedifitResponse res = new MedifitResponse(exp.getMessage(),true);
		return new ResponseEntity<MedifitResponse>(res,HttpStatus.NOT_FOUND);
	}

}
