package edu.cesur.fullstack.services;

import edu.cesur.fullstack.model.LibroDTO;

public interface LibroService {
	LibroDTO getLibro(Integer id);
	
	LibroDTO createLibro(LibroDTO l);


}
