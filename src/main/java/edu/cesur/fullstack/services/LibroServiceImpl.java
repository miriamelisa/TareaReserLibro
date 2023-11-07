package edu.cesur.fullstack.services;

import edu.cesur.fullstack.model.LibroDTO;

public class LibroServiceImpl implements LibroService {

	@Override
	public LibroDTO getLibro(Integer id) {
		if (id > 0)
			return new LibroDTO(1L, "Marianela", "Benito",false);
		
		return null;
	}

	@Override
	public LibroDTO createLibro(LibroDTO l) {
		// TODO Auto-generated method stub
		return l;
	}

}