package u04;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		char letras [] = new char [10];
		for (int i = 0; i < letras.length; i++) {
			char letraAleatoria = (char) (Math.random()*(122-97+1)+97);
			letras[i] = letraAleatoria;
			System.out.print(letraAleatoria + "\t");
		}
		System.out.println("Introduce la letra a sustituir y la suplente separadas por un espacio");
	Scanner sc = new Scanner(System.in);
	String cambio =  sc.nextLine();
	sc.close();
	char caracSust;
	}
	}


