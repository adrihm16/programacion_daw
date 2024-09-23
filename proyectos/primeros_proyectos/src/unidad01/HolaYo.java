package unidad01;

import java.util.Scanner;

/**
 * Programa que me saluda por el nombre escrito en el teclado
 */
public class HolaYo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
System.out.print("introduce tu nombre:");
String nombre= scan.nextLine();
scan.nextLine();
System.out.print("introduce tu año de nacimiento:");
int anioNacimiento = scan.nextInt();
int edad = 2024 - anioNacimiento;
System.out.println("Hola " + nombre + "! Tienes " + edad + " años.");
scan.close();
	}

}
