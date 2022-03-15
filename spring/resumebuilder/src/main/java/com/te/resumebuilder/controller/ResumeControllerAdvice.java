package com.te.resumebuilder.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.resumebuilder.bean.ResumeResponse;
import com.te.resumebuilder.exception.DetailsNotFound;
import com.te.resumebuilder.exception.ResumeException;

@RestControllerAdvice
public class ResumeControllerAdvice {

	@ExceptionHandler(ResumeException.class)
	public ResponseEntity<ResumeResponse>  noSuchElement(NoSuchElementException exp){
		ResumeResponse  res = new ResumeResponse(true,exp.getMessage() );
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DetailsNotFound.class)
	public ResponseEntity<ResumeResponse> exception(DetailsNotFound found) {
		ResumeResponse response = new ResumeResponse(true, found.getMessage());	
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResumeResponse> methodArgumentNotValidException(MethodArgumentNotValidException exp){
		ResumeResponse res = new ResumeResponse(true,exp.getFieldError().getDefaultMessage());
		return new ResponseEntity<ResumeResponse>(res,HttpStatus.NOT_FOUND);
	}
}
