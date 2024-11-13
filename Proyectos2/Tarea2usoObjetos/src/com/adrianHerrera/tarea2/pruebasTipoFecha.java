package com.adrianHerrera.tarea2;

import java.util.Scanner;

public class pruebasTipoFecha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una fecha en formato dd-mm-yyyy y te dire la edad de esa fecha");
		String fechaIntroducida = sc.nextLine();
		System.out.println(
				"la edad de la fecha introducida es " + UtilidadesFechas.calcularEdad(fechaIntroducida) + " años.");
		sc.close();
	}

}
