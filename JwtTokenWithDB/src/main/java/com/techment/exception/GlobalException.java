package com.techment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<String> myException(InvalidUserException exception) {
		
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.UNAUTHORIZED);
		
	}

}
