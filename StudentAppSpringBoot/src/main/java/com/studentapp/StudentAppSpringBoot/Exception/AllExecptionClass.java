package com.studentapp.StudentAppSpringBoot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class AllExecptionClass extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AllExecptionClass(String msg) {
		super(msg);
		
	}
	

}
