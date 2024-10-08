package u02;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		/*
		 * Devuelve segun la opcion:
		 * 1. Cúal es la primera cifra de un número entero introducido por el teclado
		 * 2. Cúal es la ulyima cifra de un numero entero introducido por el teclado
		 * */


		Scanner scan = new Scanner (System.in);
			/*
		 * Devuelve segun la opcion:
		 * 1. Cúal es la primera cifra de un número entero introducido por el teclado
		 * 2. Cúal es la ulyima cifra de un numero entero introducido por el teclado
		 * */
 


	System.out.print("Introduce el numero: ");
	String numero = scan.nextLine();
	int primeraCifra = Integer.parseInt(numero.substring(0, 1));
	System.out.println("La ultima cifra de " + numero + " es " + primeraCifra);
		//obtiene la primera cifra del numero
		

		//Obtiene la primera cifra del numero
		int ultimaCifra = Integer.parseInt(numero) % 10;
		System.out.println("y la ultima cifra de " + numero +" es " + ultimaCifra);

	
	
	


		scan.close();
	}

}
