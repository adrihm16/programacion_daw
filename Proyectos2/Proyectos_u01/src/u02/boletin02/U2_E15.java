package u02.boletin02;

import java.util.Scanner;

public class U2_E15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correcta = true;
		boolean entreSemana = true;
		String dia = "";
		String asignatura = "";
		do {
			correcta = true;
			entreSemana = true;
			System.out.println("escribe un día de la semana y aparecerá la primera asignatura de ese día.");
			dia = scan.nextLine().toLowerCase();
			switch (dia) {
			case "lunes":
				asignatura = "entornos de desarrollo";
				correcta = true;
				entreSemana = true;
				break;
			case "martes":
				asignatura = "programación";
				correcta = true;
				entreSemana = true;
				break;
			case "miercoles":
				dia = "miércoles"; // esto lo hago para que salga escrito con tilde.
				asignatura = "bases de datos";
				correcta = true;
				entreSemana = true;
			case "miércoles":
				asignatura = "bases de datos";
				correcta = true;
				entreSemana = true;
				break;
			case "jueves":
				asignatura = "lenguaje de marcas";
				correcta = true;
				entreSemana = true;
				break;
			case "viernes":
				asignatura = "programación";
				correcta = true;
				entreSemana = true;
				break;
			case "sabado":
				dia = "sábado";
				correcta = true;
				entreSemana = false;
			case "sábado":
				correcta = true;
				entreSemana = false;
			case "domingo":
				correcta = true;
				entreSemana = false;
				break;
			default:
				correcta = false;
				break;
			}
		} while (!correcta);
		if (entreSemana && correcta) {
			System.out.println("El " + dia + " a primera toca " + asignatura + ".");
		} else if (!entreSemana) {
			System.out.println("Los fines de semana no hay clases!");
		} else {
			System.err.println("No has introducido un día válido!");
		}
		scan.close();
	}

}
