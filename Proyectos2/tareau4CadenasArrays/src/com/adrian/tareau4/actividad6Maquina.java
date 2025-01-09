package com.adrian.tareau4;

import java.util.Arrays;
import java.util.Scanner;

public class actividad6Maquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] productos = { { "CC", "SP", "FN" }, { "FL", "RB", "MO" }, { "PE", "SW", "Agua" },
				{ "CCamp", "Hei", "ZPi" } };
		int[][] cantidad = new int[4][3];
		// Llenar cada fila con el valor 4
		for (int i = 0; i < cantidad.length; i++) {
			Arrays.fill(cantidad[i], 5);
		}
		int opcion = 0;
		do {

			System.out.println("introduce una opción \n1.-Pedir bebidas \n2.-Mostrar bebidas \n3.-apagar máquina.");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce la fila y la columna de la bebida en este orden: 21.");
				int eleccion = sc.nextInt();
				
				break;
			case 2:
				for (int i = 0; i < cantidad.length; i++) {
					for (int j = 0; j < cantidad[0].length; j++) {
						if (cantidad[i][j] != 0) {
							System.out.print(productos[i][j] + "\t");
						} else {
							System.out.print("\t");
						}
					}
					System.out.println("");
				}

				break;
			case 3:
				System.out.println("Apgando la máquina...");
				break;

			default:
				System.out.println("No has introducido una opción correcta, vuelve a introducir una.");
				break;
			}
		} while (opcion != 3);

	}

}
