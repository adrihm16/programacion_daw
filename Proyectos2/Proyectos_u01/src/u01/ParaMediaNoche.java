package u01;

import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (hora y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		// Declaración objeto scanner
		Scanner scan = new Scanner(System.in);
		//
		System.out.print("introduce la hora actual: ");
		int hora = scan.nextInt();
		System.out.print("introduce los minutos actuales: ");
		int minutos = scan.nextInt();
		int hr = (23 - hora);
		int mr = (60 - minutos);
		int sr = (hr*3600 + mr*60);
		System.out.println("\nQuedan " + sr + " segundos para la media noche.");
		scan.close();
	}

}
