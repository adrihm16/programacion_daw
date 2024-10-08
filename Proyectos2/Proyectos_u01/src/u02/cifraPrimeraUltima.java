package u02;

import java.util.Scanner;

public class cifraPrimeraUltima {

	public static void main(String[] args) {
		/**
		 * Devuelve segun la opcion:
		 * 1 cual es la primera cifra de un numero entero introducido por teclado
		 * 2 cual  es la ultima cifra de un numero entero introducido por teclado
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica un numeros enteros");
		int numero = scan.nextInt();
		
		System.out.println("""
				
		Elige una opcion
		1-Indica la primera cifra
		2-Indica  la ultima cifra
		""");
		boolean correcto = true ;
		do {
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int dividendo = numero;
				int primeraCifra =0;
				while(dividendo != 0) {
					//dividendo = dividendo /10;
					primeraCifra=dividendo;
					dividendo/=10;
					System.out.println("La primera cifra del numero " + numero + "es" + primeraCifra);
				}
				break;
			case 2:
				int ultimaCifra = numero % 10;
				System.out.println("La ultima cifra del numero " + numero + "es" + ultimaCifra);
				break;
			default:
				correcto= false;
				System.out.println("No se ha elegido una opcion valida");
				break;
			}
			
		}while(!correcto);
		scan.close();
		
		
		
		
		
		
	}

}
