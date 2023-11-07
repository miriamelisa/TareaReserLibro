package edu.cesur.fullstack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LibroNotFoundException extends RuntimeException {
	String msg;
	
	public LibroNotFoundException(String msg) {
		super(msg);
	}
}
