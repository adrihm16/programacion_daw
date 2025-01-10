package com.adrian.tareau4;

import java.util.Arrays;
import java.util.Scanner;

public class actividad6Maquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] productos = { { "CCola", "SP", "FaNar" }, { "FaLim", "RBull", "Mons" }, { "Pepsi", "SW", "Agua" },
				{ "CCamp", "Hein", "ZuPiñ" } };
		int[][] cantidad = new int[4][3];
		// Llenar cada fila con el valor 4
		for (int i = 0; i < cantidad.length; i++) {
			Arrays.fill(cantidad[i], 5);
		}
		int filaSelec = 0;
		int colSelec = 0;
		int opcion = 0;
		do {

			System.out.println("introduce una opción \n1.-Pedir bebidas \n2.-Mostrar bebidas \n3.-apagar máquina.");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				 System.out.println("Introduce la fila y la columna de la bebida en este orden: 21.");
			        String eleccion = sc.nextLine();
			        try {
			            // Intentamos convertir los valores de fila y columna
			            filaSelec = Integer.parseInt(eleccion.substring(0, 1));
			            colSelec = Integer.parseInt(eleccion.substring(1, 2));
			        } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
			            System.err.println("La entrada no es válida. Asegúrate de introducir dos números.");
			        }
			        if ((cantidad[filaSelec][colSelec]==0)) {
						System.out.println("Lo sentimos, no hay stock de esta bebida.");
					} else {
						  cantidad [filaSelec][colSelec] -=1;
					}
			        
			      
			    	for (int i = 0; i < cantidad.length; i++) {
						for (int j = 0; j < cantidad[i].length; j++) {
							System.out.print(cantidad[i][j] + "\t");
							}
						System.out.println("");
					}
			
				break;
			case 2:
				System.out.println("\tCol 0\tCol 1\tCol 2");
				System.out.println("______________________________");
				for (int i = 0; i < cantidad.length; i++) {
					System.out.printf("Fil %d|\t",i);
					for (int j = 0; j < cantidad[i].length; j++) {
						if (cantidad[i][j]==0) {
							System.out.print("VACÍO"+"\t");
						} else {
							System.out.print(productos[i][j]+"\t");
						}
						
					}System.out.println("");
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
