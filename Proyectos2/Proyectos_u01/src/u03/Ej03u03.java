package u03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03u03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Introduce A.");
		int A=scan.nextInt();
		System.out.println("Introduce B.");
		int B=scan.nextInt();
		int resultado= A/B;
		System.out.printf("EL resultado de %d / %d es %d",A , B, resultado);
	} catch (InputMismatchException ime) {
	System.out.println("Solo se permte introducir números enteros.");
	}
	catch (ArithmeticException ae) {
		System.out.println("No se puede dividir entre 0");
	}

	}

}
