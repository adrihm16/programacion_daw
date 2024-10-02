package u02;

import java.util.Scanner;

/*
 * Devuelve el mayor numero de los introducidos por el teclado
 * */
public class MayorNumeroFor{

	public static void main(String[] args) {
		// Opción A. Indicamos el numero de datos a evaluar
		Scanner scan = new Scanner (System.in);
		System.out.print("introduce un número de datos para calcular el número máximo ");
		int numeroDeDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		//Ejecutamos tantas veces como quiera el usuario
		for (int index = 0; numeroDeDatos < index ;index++) {
		System.out.println("introduce el dato numero " + (index + 1));
		int numActual = scan.nextInt();
		if (mayorNumero <numActual) {
			mayorNumero=numActual;
		}
		System.out.println("Te faltan " + (numeroDeDatos - (index + 1)));
		}
		System.out.println("El mayor numero es el " + mayorNumero);
		// Opción B Establecemos una instruccion de parada
		//La instrucción de para será stop
		String numeroCadena = scan.nextLine();
		int numeroEntero = Integer.parseInt(numeroCadena);
		
scan.close();

	}
}

