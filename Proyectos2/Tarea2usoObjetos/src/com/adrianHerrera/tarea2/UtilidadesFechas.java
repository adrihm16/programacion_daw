package com.adrianHerrera.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesFechas {
	/**
	 * devuelve la edad de una fecha en años
	 * 
	 * @param fechaIntroducida
	 * 
	 * @return edad
	 * 
	 */
	public static int calcularEdad(String fechaIntroducida) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		int edad = 0;
		try {
			Date fechaIntroducidaDate = sdf.parse(fechaIntroducida);
			Date fechaActual = new Date();
			fechaIntroducidaDate.before(fechaActual);
			long edadMiliSec = fechaActual.getTime() - fechaIntroducidaDate.getTime();
			edad = (int) (edadMiliSec / 1000 / 60 / 60 / 24 / 365);
		} catch (ParseException pe) {
			System.err.println("El formato introducido no es correcto.");
			pe.printStackTrace();
		}
		return edad;
	}

	/**
	 * Devuelve el mes del año en el que se encuentra la fecha introducida.
	 * 
	 * @param fechaIntroducida
	 * 
	 * @return mes
	 * 
	 */
	public static String obtenerMes(String fechaIntroducida) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String mes = "";
		try {
			Date fechaIntrDate = sdf.parse(fechaIntroducida);
			Calendar fechaIntrCal = Calendar.getInstance();
			fechaIntrCal.setTime(fechaIntrDate);
			switch (fechaIntrCal.get(Calendar.MONTH)) {
			case 0:
				mes = "enero";
				break;
			case 1:
				mes = "febrero";
				break;
			case 2:
				mes = "marzo";
				break;
			case 3:
				mes = "abril";
				break;
			case 4:
				mes = "mayo";
				break;
			case 5:
				mes = "junio";
				break;
			case 6:
				mes = "julio";
				break;
			case 7:
				mes = "agosto";
				break;
			case 8:
				mes = "septiembre";
				break;
			case 9:
				mes = "octubre";
				break;
			case 10:
				mes = "noviembre";
				break;
			case 11:
				mes = "diciembre";
				break;
//No uso default porque no es posible que aparezca otro valor (En el calendario gregoriano) 
			}
		} catch (ParseException pe) {
			System.err.println("El formato introducido no es correcto.");
			pe.printStackTrace();
		}
		return mes;
	}
	
}
