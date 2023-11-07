package edu.cesur.fullstack.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.exception.LibroNotFoundException;
import edu.cesur.fullstack.model.LibroDTO;
import edu.cesur.fullstack.services.LibroService;
@RestController
@RequestMapping("/libros")
public class LibroRestController {

		LibroService libroService;

		public LibroRestController(LibroService libroService) {
			this.libroService = libroService;
		}

		@GetMapping("/{id}")
		public ResponseEntity<?> getLibroById( @PathVariable Integer id) {
			if (libroService.getLibro(id) != null)
				return ResponseEntity.ok(libroService.getLibro(id));

			throw new LibroNotFoundException("No existe un coche con ese id");
		}
		
		@PostMapping
		public ResponseEntity<?> saveLibro(@RequestBody @Validated LibroDTO libro) {
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(libro.getId())
					.toUri();
			
			return ResponseEntity.created(location).body(libroService.createLibro(libro));
		}

}
