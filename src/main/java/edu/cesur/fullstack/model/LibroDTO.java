package edu.cesur.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LibroDTO {
	private Long id; 
	private String titulo; 
	private String autor; 
	private Boolean reservado;
	

}
