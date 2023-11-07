package edu.cesur.fullstack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidLibroException extends RuntimeException {

	String msg;

	public InvalidLibroException(String msg) {
		super(msg);
	}

}