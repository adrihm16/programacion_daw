package u01;

import java.util.Scanner;

public class HolaMundoPro {

	public static void main(String[] args) {
		/*pide al usuario un nombre, si le da al intro sin escribir nada di hola amigo*/
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce tu nombre");
		String nombre = scan.nextLine();
		//cuando el usuario no mete ningun nombre el valor que guarda es una cadena vacía, es decir, ""
		//version con if else
		if ("".equals(nombre)) {
			nombre="amigo"; 
		}
		System.out.println("Hola " + nombre + "!");
scan.close();
	}

}

