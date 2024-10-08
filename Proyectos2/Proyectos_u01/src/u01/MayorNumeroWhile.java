package u01;

import java.util.Scanner;

public class MayorNumeroWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Opción B Establecemos una instruccion de parada
				//La instrucción de para será stop
		System.out.print("introduce \"Stop\" cuando quieras parar de introducir números");
		Scanner scan = new Scanner (System.in);
		String dato = "";
		boolean salir = false;
				int mayorNumero = Integer.MIN_VALUE;
				do {
					System.out.print("Introduce un entero: ");
					dato = scan.nextLine();
					if("STOP".equalsIgnoreCase(dato)) {
						
				salir = true;
					} else {
					int datoEntero = Integer.parseInt(dato)	;
					//asignacion de valor a salir con operador tenario
					mayorNumero = datoEntero > mayorNumero ? datoEntero : mayorNumero;
					}System.out.println("El mayor numero introducido hasta ahora es el" + mayorNumero);
				} while (!salir);
				scan.close();
				System.out.println("El mayor numero de todos es el" + mayorNumero);
	}

}
