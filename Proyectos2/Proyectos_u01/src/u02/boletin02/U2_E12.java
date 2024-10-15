package u02.boletin02;

import java.util.Scanner;

public class U2_E12 {

	public static void main(String[] args) {
		/**
		 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
		 * puede ser positivo o negativo.
		 */
		boolean entradaCorrecta=true;
		Scanner scan = new Scanner(System.in);
		do {
		entradaCorrecta = true;
		System.out.println("Introduce un numeros entero");
		int num = scan.nextInt();
		if(num !=0) {
		
		int numActual = num;
		int numCifras = 1;
		while(numActual/10 !=0) {
			numCifras++;
			numActual= numActual/10;
		}
		System.out.println("El numero " + num + " tiene " + numCifras + " cifras.");
		} else {
			System.out.println("vuelve a introducir un número distinto de 0");
			entradaCorrecta=false; 
		}
		}while (!entradaCorrecta); 
		scan.close();
	} 
 }
		
