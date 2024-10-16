package u02.boletin02;
/*
 * 19
 * */

import java.util.Scanner;

public class U2_E19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce el número de inicio");
		int numero = scan.nextInt();
		System.out.println("introduce el fin");
		int fin = scan.nextInt();
		if (numero >= fin) {
			System.out.println("introduce el decremento");
			int decremento = scan.nextInt();
			for (int index = numero; index >= fin; index = index - decremento) {
				System.out.println(index);
			}

		} else {
			System.out.println("introduce el incremento");
			int incremento = scan.nextInt();
			for (int index = numero; index <= fin; index = index + incremento) {
				System.out.println(index);
			}

		}scan.close();
	}
}
