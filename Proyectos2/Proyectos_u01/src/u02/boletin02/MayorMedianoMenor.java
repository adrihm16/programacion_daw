package u02.boletin02;

import java.util.Scanner;

public class MayorMedianoMenor {

	public static void main(String[] args) {

		// declaración del scanner para obtener los datos por teclado
		Scanner scan = new Scanner(System.in);
		// Petición al usuario de los datos de entrada y se guardan en variables
		System.out.println("Este programa devuelve el mayor de tres números introducidos por teclado.");
		System.out.print("Introduce el primer número:");
		int numero1 = scan.nextInt();
		System.out.print("\nIntroduce el segundo número:");
		int numero2 = scan.nextInt();
		System.out.println("\nIntroduce el tercer número:");
		int numero3 = scan.nextInt();
		scan.close();

		// Cálculo del mayor número
		int mayor = 0;
		int menor = 0;
		int mediano = 0;
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
			if (mayor < numero3) {
				mayor = numero3;
				mediano = mayor;
			} else if (menor > numero3);
			{
				menor = numero3;
				menor = mediano;
			}
		} else {
			mayor = numero2;
			menor = numero1;
			if (mayor < numero3) {
				mediano = mayor;
				mayor = numero3;
			}else if (menor > numero3);
			{
				mediano = menor;
				menor = numero3;
			}
		}
		// respuesta final del programa
		System.out.println("\nEl mayor número es: " + mayor);
		System.out.println("\nEl mediano es: " + mediano);
		System.out.println("\nEl menor número es: " + menor);

	}
}