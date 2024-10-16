package com.AdrianHerrera.tarea2;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		// declaración variables
		String salida = "salida";
		String nombreUser = "Pepito";
		Scanner scan = new Scanner(System.in);
		String contraseña = "Pepito1234";
		String contrIntroducida = "";
		int intentos = 0;
		System.out.print("Hola " + nombreUser + ", para acceder, ");
		// comienza el do while
		do {
			intentos++;
			System.out.println("introduce tu contraseña respetando las mayúsculas.");
			contrIntroducida = scan.nextLine();
			// contraseña correcta
			if (contrIntroducida.equals(contraseña)) {
				System.out.println("Bienvenido, " + nombreUser + ".");
				// contraseña incorrecta
			} else {
				System.out.println(
						"¡No has introducido la contraseña correcta! Te queda(n) " + (3 - intentos) + " intento(s)");
			}
		} while (!contrIntroducida.equals(contraseña) && intentos < 3);
		scan.close();
		if (intentos == 3) {
			System.out.println("Lo sentimos, has superado el número de intentos, vuelve a intentarlo más tarde.");
			System.out.println(salida);
		}

	}

}
