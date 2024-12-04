package u04;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] temperaturas = new int[12];
		String[] mes = {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"};
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura de "+mes[i]+": ");
			temperaturas[i] = scan.nextInt();
		}
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(mes[i]+"\t");
			for (int j = 0; j < temperaturas[i]; j++) {
				System.out.print("-");
			}
			System.out.println("");
		}
	}

}
