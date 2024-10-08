package u02;
import java.util.Scanner;
public class U2_E04 {
/*
 * Realiza un programa que resuelva una ecuación de segundo grado
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner y recolección de datos
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa resolverá la eecuación de segundo grado según los valores introducidos por teclados");
		System.out.print("introduce el valor de a: ");
		double a = scan.nextDouble();
		System.out.print("introduce el valor de b: ");
		double b = scan.nextDouble();
		System.out.print("introduce el valor de c: ");
		double c = scan.nextDouble();
		
	//Resuelvo el valor de x	
		if (a == 0) {
			System.out.println("El valor de a no puede ser negativo!");
		} else if (Math.pow(b, 2)<=(4*a*c)) {
			System.out.println("El valor de b cuadrado debe ser mayor que 4*a*c!");
				
			} else {

			
			double x1 = ((- b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(a*2));
			System.out.println("El primer valor de x es " + x1 +"!");
			
			double x2 = ((- b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(a*2));
			System.out.println("El segundo valor de x es " + x2 +"!");
			scan.close();
		}		
	}
}
