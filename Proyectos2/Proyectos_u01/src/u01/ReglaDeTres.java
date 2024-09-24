package u01;

import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce a:");
		double a = scan.nextDouble();
		System.out.print("introduce b");
		double b = scan.nextDouble();
		System.out.print("introduce c");
		double c = scan.nextDouble();
		double x = (b * c) / a;
		System.out.println("\nLa solución de la regla de 3 es:");
		System.out.print(a);
		System.out.print("--->");
		System.out.print(b);
		System.out.print(c);
		System.out.print("--->");
		System.out.print(x);
		scan.close();
	}

}
