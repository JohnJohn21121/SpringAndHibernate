package com.johnjohn21121.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception){
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage("Student Id Is only Verified with numbers, the Input Does not Match the parameters. "
				+ "Pleaser enter the Student ID as an Integer");
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);	
		}
}
