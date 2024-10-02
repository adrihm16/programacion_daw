package u02;
/*Se introducen 3 numeros enteros por teclado y debe devolver el mayor de ellos
 * 
 */
import java.util.Scanner;

public class MayorNumeroDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.print("introduce a: ");
int a = scan.nextInt();
System.out.print("introduce b: ");
int b = scan.nextInt();
System.out.print("introduce c: ");
int c = scan.nextInt();
if (a >= b & a >= c) {
	System.out.println("El mayor numero es " + a + "!");
}else  if (b  >= a & b >= c ) {

		System.out.println("El mayor numero es " + b + "!");
	
}else  if (c >= a & c >= b ) {

	System.out.println("El mayor numero es " + c + "!");

} else {
	System.err.println("Los valores introducidos son erróneos!");
	
}
scan.close();
	}

}
