package com.adrianHerrera.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UtilidadesFechas {
	/*devuelve la edad de una fecha en añs
	 * @param fechaIntroducida
	 * */
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
}
