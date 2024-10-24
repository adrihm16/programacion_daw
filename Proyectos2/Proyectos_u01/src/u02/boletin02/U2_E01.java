package u02.boletin02;

import java.util.Scanner;

public class U2_E01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correcto = true;
		int horasOrd = 0;
		int horasExtr = 0;
		int salarioOrd = 0;
		int salarioExtr = 0;
		int salarioTot = 0;
		do {
			correcto=true;
			System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
			int horasTot = scan.nextInt();
			if (horasTot < 0 || horasTot > 168) {
				System.err.println("No has introducido un número de horas correcto, vuelve a introducirlo");
				correcto = false;
			} else {
				if (horasTot > 40) {
					horasOrd = 40;
					horasExtr = horasTot - horasOrd;
				} else {
					horasOrd = horasTot;
				}
				salarioOrd = horasOrd * 12;
				salarioExtr = horasExtr * 16;
				salarioTot = salarioOrd + salarioExtr;
			}
		} while (!correcto);
		scan.close();
		System.out.println("El sueldo semanal que le corresponde es de " + salarioTot + "€.");
	}

}
