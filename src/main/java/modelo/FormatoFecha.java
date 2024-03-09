package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoFecha {
	private LocalDate fecha;

	public FormatoFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String obtenerFormatoLargo() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
		return fecha.format(formatter);
	}

	public LocalDate obtenerFormatoCorto() {
		return fecha;
	}
}
