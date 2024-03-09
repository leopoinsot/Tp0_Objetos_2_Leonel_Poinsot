package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {
	private LocalDate fecha;
	private LocalTime hora;

	public Tiempo(LocalDate fecha, LocalTime hora) {
		super();
		this.fecha = fecha;
		this.hora = hora;
	}

	public LocalDate obtenerFechaFormatoCorto() {
		return fecha;
	}

	public String obtenerFechaFormatoLargo() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
		return fecha.format(formatter);
	}
}
