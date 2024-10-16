package u02.boletin02;
/*
Escribe un programa que lea una lista de diez números y determine cuántos 
son positivos, y cuántos son negativos.
 * */

import java.util.Scanner;

public class U2_E21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce 10 números y te diré cuantos son negativos y cuantos son positivos");
		int numero=0;
		int cantPositivos= 0;
		int cantNegativos=0;
		
		for (int i = 0; i <10; i++) {
	System.out.println("Introduce un número (Quedan " + (10-i) +" intentos)" );
	numero=scan.nextInt();
			if (numero>0) {
				cantPositivos++;
			} else  if (numero<=0){
cantNegativos++;
			}
		}
		scan.close();
		System.out.println("De todos estos números " + cantPositivos +" son positivos y " + cantNegativos +" son negativos");
	}

}
