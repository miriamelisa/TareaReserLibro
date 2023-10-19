package edu.cesur.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {
	private Long id;
	private String nombre;
	private String correoElectronico;
}
