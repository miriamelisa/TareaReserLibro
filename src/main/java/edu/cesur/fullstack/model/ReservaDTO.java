package edu.cesur.fullstack.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservaDTO {
	private Long id;
	private Long libroId;
	private Long usuarioId;
	private LocalDate fechaReserva;
	private LocalDate returnDate;

}
