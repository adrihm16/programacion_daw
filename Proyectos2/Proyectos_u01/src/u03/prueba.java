package u03;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un número y te diré sus cifras: ");
	long numDNI = sc.nextLong();
	System.out.println("El numero de cifras es " + FuncionesMatematicas.letraDNI(numDNI));
	sc.close();
	}

}
