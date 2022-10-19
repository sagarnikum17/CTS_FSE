package com.digitalbook.author.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.digitalbook.author.exception.AuthorException;



@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(AuthorException.class)
	public ResponseEntity<?> handleMovieException(AuthorException ao) {
			

		return new ResponseEntity<String>("BookException: "+ao.getMessage(), HttpStatus.OK);
	}
	
}
