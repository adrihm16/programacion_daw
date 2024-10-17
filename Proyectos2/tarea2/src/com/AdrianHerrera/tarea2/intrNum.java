package com.AdrianHerrera.tarea2;

import java.util.Scanner;

public class intrNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// declaración variables fuera del do while para que no haya errores
		int numIntr = Integer.MIN_VALUE;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		int media = 0;
		int contador = 0;
		do {
			numIntr = 1;
			System.out.println("Introduce varios números y te diré cual es ");
			System.out.println("el menor");
			System.out.println("el mayor");
			System.out.println("la suma de todos");
			System.out.println("la media aricmética de todos");
			numIntr = scan.nextInt();
			if (numIntr != 0) { // solo se hace si el número no es 0
				suma = suma + numIntr; // suma
				contador++;

				if (numIntr > mayor) {
					mayor = numIntr; // mayor número
				}

				if (numIntr < menor) {
					menor = numIntr; // menor número
				}
			}
		} while (numIntr != 0);
		scan.close();
		if (contador != 0) {
			media = suma / contador;
		} else {
			System.out.println("no has introducido ningún numero para hacer la media!");
		}
		System.out.println("De los valores introducidos:");
		System.out.println("El mayor es el " + mayor + ".");
		System.out.println("El menor es el " + menor + ".");
		System.out.println("La suma de todos es " + suma + ".");
		System.out.println("La media aricmética es " + media + ".");
	}
}
