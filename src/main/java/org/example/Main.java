package org.example;

import modelo.FormatoFecha;
import modelo.Tiempo;
import modelo.TiempoRecord;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		System.out.print("\n------------------NO ANEMICO----------------------");
		//NO ANEMICO ------------------ Delega la logica al objeto y no al modelo de dominio (Encapsulamineto)
		Tiempo tiempo = new Tiempo(LocalDate.now(), LocalTime.now());
		System.out.print("\nLa fecha de hoy en formato corto: " + tiempo.obtenerFechaFormatoCorto());
		System.out.print("\nLa fecha de hoy en formato largo: " + tiempo.obtenerFechaFormatoLargo());

        /*
		//ANEMICO --------------------- Delega la logica al modelo de dominio y no al objeto (No encapsulamiento)
		TiempoAnemico = new TiempoAnemico(LocalDate.now(), LocalTime.now());
		System.out.print("\nLa fecha de hoy en formato corto: " + tiempoAnemico.getFecha());
		System.out.print("\nLa fecha de hoy en formato largo: " + obtenerFechaFormatoLargo(tiempoAnemico.getFecha()));
	    */

		//RECORD -----------------------------------------------------------------------------------------------
		System.out.print("\n-------------------RECORD------------------------ ");
		TiempoRecord tiempoRecord = new TiempoRecord(LocalDate.now(), LocalTime.now());
		FormatoFecha formatoFecha = new FormatoFecha(tiempoRecord.fecha());
		System.out.print("\nLa fecha de hoy en formato corto: " + formatoFecha.obtenerFormatoCorto());
		System.out.print("\nLa fecha de hoy en formato largo: " + formatoFecha.obtenerFormatoLargo());
	}
}
