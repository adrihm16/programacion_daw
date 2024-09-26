package u01;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce un número entero para ver si es par o impar");	
		int numero;
		numero =  scan.nextInt();
		String paridad;
		paridad = numero % 2 == 0 ? "par" : "impar";
		System.out.println("El número introudcido es " + paridad);
scan.close();
	}

}
