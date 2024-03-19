package com.studentapp.StudentAppSpringBoot.model;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.studentapp.StudentAppSpringBoot.Exception.AllExecptionClass;

@RestControllerAdvice
@RestController
public class GlobalException extends ResponseEntityExceptionHandler{
	@ExceptionHandler
	public ResponseEntity<?> getEmailException(AllExecptionClass exp,WebRequest req){
		return new ResponseEntity<>(exp.getMessage(),HttpStatus.BAD_REQUEST);
		
	}

}
