package edu.cesur.fullstack.exceptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.exception.InvalidLibroException;
import edu.cesur.fullstack.exception.LibroNotFoundException;

@RestControllerAdvice
//public class GlobalExceptionsHandler  extends ResponseEntityExceptionHandler {
public class GlobalExceptionsHandler  {

	@ExceptionHandler( LibroNotFoundException.class )
	public ProblemDetail handleCocheNotFoundException(LibroNotFoundException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Custom Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Coche");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
	
	@ExceptionHandler(InvalidLibroException.class)
	public ProblemDetail handlerCocheNotFoundException(InvalidLibroException e) {
		
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
		problemDetail.setTitle("Coustom Exception Occuder");
		problemDetail.setType(URI.create("http://localhost/8080/coches"));
		problemDetail.setProperty("errorCategory", "Coche");
		problemDetail.setProperty("timeStamp", Instant.now());
		
		return problemDetail;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ProblemDetail handlerCocheNotFoundException(MethodArgumentNotValidException e) {
		
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
		problemDetail.setTitle("Coustom Exception Occuder");
		problemDetail.setType(URI.create("http://localhost/8080/coches"));
		problemDetail.setProperty("errorCategory", "Coche");
		problemDetail.setProperty("timeStamp", Instant.now());
		
		return problemDetail;
	}

//	@ExceptionHandler({ LibroNotFoundException.class, UsuarioNotFoundException.class })
//	public ProblemDetail handleNotFoundException(RuntimeException e) {
//
//		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
//		problemDetail.setTitle("Custom Exception Occurred");
//		problemDetail.setType(URI.create("http://cesurformacion.com"));
//		problemDetail.setProperty("timeStamp", Instant.now());
//
//		if (e instanceof LibroNotFoundException) {
//			problemDetail.setProperty("errorCategory", "Libro");
//		} else if (e instanceof LibroNotFoundException) {
//			problemDetail.setProperty("errorCategory", "Libro");
//		}
//
//		return problemDetail;
//	}
	
	
	
	
	
}
