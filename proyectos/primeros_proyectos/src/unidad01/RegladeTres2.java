package unidad01;

import java.util.Scanner;

public class RegladeTres2 {

	public static void main(String[] args) {
		//escribe aqui
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce a:");
		int a = scan.nextInt();
		scan.nextInt();
		System.out.print("introduce b");
		int b = scan.nextInt();
		scan.nextInt();
		System.out.print("introduce c");
		int c = scan.nextInt();
		scan.nextInt();
		float x = (b * c) / a;
		System.out.println("el valor de x es " + x);
		scan.close();
	}

}
