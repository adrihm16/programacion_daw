package u03;

import java.util.Scanner;

public class ej01u03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do {
			utilidadesEj1.mostrarMenu();
			System.out.println("Elige una opción:");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int entero = utilidadesEj1.aniadir(opcion);
				break;
			case 2:
				System.out.println("Has borrado un elemento!");
				break;
			case 3:
				System.out.println("Has modificado un elemento!");
				break;
			case 4:
				System.out.println("Has mostrado un elemento por pantalla!");
				break;
			case 5:
				System.out.println("Hasta pronto!");
				break;
			case 6:
				System.out.println("Cuántos saltos quieres introducir?");
				int saltos = scan.nextInt();
				utilidadesEj1.saltos(saltos);
				break;
			default:
				System.out.println("Has elegido una opción incorrecta!");
				break;
			}
		} while (opcion != 5);
	}

}
