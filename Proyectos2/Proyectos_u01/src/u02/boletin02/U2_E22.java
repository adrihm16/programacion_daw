package u02.boletin02;

import java.util.Scanner;

public class U2_E22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce un número y te dire si es primo o no");
		int numero = scan.nextInt();
		boolean primo = true;
		for (int divisor = (numero-1); divisor>2 ; divisor--) {
	
			if(numero % divisor == 0) {
				primo= false;
			}
			}
		System.out.println(primo);
scan.close();
	}

}
