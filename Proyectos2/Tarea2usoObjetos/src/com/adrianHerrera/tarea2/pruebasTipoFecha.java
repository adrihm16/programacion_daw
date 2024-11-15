package com.adrianHerrera.tarea2;

import java.util.Scanner;

public class pruebasTipoFecha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 33;
		do {
			System.out.println("Introduce el número de la función que quieras probar: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 0:
				System.out.println("Hasta pronto!");
				break;
			case 1:
				System.out.println("Introduce una fecha en formato DD-MM-YYYY y te dire la edad de esa fecha: ");
				String fechaIntroducida = sc.nextLine();
				System.out.println("La edad de la fecha introducida es "
						+ UtilidadesFechas.calcularEdad(fechaIntroducida) + " años.");
				break;
			case 2:
				System.out.println(
						"Introduce una fecha en formato DD-MM-YYYY y te diré el mes en el que esta se encuentra: ");
				String fechaIntroducida1 = sc.nextLine();
				System.out.println(
						"El mes en el que se encuentra es " + UtilidadesFechas.obtenerMes(fechaIntroducida1) + ".");
				break;
			default:
				System.out.println("Has elegido una opción incorrecta!");
				break;
			}
		} while (opcion != 0);
		sc.close();
	}

}
