package u04;

import java.util.Scanner;

public class Ej05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[15];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número:");
			numeros[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < numeros.length; i++) {
			int ISum= i+1;
	
			System.out.println(numeros[ISum]);
		}
	}

}
