package u02;

import java.net.Socket;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el numero: ");
		int numero = scan.nextInt();
		// Obtiene la primera cifra del número
		int dividendo = numero;
		int primeraCifra = 0;
		int ult = 0;
		int numCifras = 0;
		while (dividendo != 0) {
			numCifras++;
			primeraCifra = dividendo;
			dividendo /= 10;
		}
		ult = numero % 10;
		if (ult == primeraCifra) {
			for (int i = 0; i < numCifras/2; i++) {
				
			}
		} else {
			System.out.println("No es capicuo");
		}

		System.out.println("Primera cifra = "+primeraCifra);
		System.out.println("Ultima cifra = "+ult);
		System.out.println("El numero tiene "+numCifras+" cifras.");
		scan.close();
	}

}
