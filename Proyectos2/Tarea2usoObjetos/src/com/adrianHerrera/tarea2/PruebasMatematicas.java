package com.adrianHerrera.tarea2;

import java.util.Scanner;

public class PruebasMatematicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Introduce el número de la función que quieras probar: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 0:
				System.out.println("Hasta pronto!");
				break;
			case 1:
				System.out.println("Introduce un número y el dígito que quieras y te diré en que posición está.");
				System.out.println("Introduce el número:");
				int numero = sc.nextInt();
				System.out.println("Introduce el digito:");
				int digito = sc.nextInt();
				try {
					System.out.println("La posición del número introducido es "
							+ UtilidadesMatematicas.PosicionDeDigito(numero, digito) + ".");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Introduce un número y el dígito que quieras y te diré en que posición está.");
				System.out.println("Introduce el número:");
				int numeroInicioFin = sc.nextInt();
				System.out.println("Introduce el inicio:");
				int inicio = sc.nextInt();
				System.out.println("Introduce el fin:");
				int fin = sc.nextInt();
				try {
					System.out.println("El trozo extraído del número seleccionado es "
							+ UtilidadesMatematicas.trozoNumero(numeroInicioFin, inicio, fin) + ".");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Introduce dos números y t los juntaré");
				System.out.println("Introduce el número 1:");
				int numero1 = sc.nextInt();
				System.out.println("Introduce el número 2:");
				int numero2 = sc.nextInt();
				System.out.println("Los dos números juntos forman el "
						+ UtilidadesMatematicas.juntaNumeros(numero1, numero2) + ".");
				break;
			case 4:
				System.out.println("Introduce un número y te calcularé su factorial");
				System.out.println("Introduce el número 1:");
				int numeroFactorial = sc.nextInt();
				System.out.println("El factorial es "
						+ UtilidadesMatematicas.factorial(numeroFactorial) + ".");
				break;
			case 5:
				System.out.println("Introduce el dinero que quieres cambiar y te diré su cambio mínimo:");
				double cantidad = sc.nextDouble();
				UtilidadesMatematicas.cambioExacto(cantidad);
				break;
			default:
				System.out.println("Has elegido una opción incorrecta!");
				break;
			}
		} while (opcion != 0);
		sc.close();
	}

}
