package com.digitalbook.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.digitalbook.exception.BookException;



@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(BookException.class)
	public ResponseEntity<?> handleMovieException(BookException bo) {
			

		return new ResponseEntity<String>("BookException: "+bo.getMessage(), HttpStatus.OK);
	}
	
}
