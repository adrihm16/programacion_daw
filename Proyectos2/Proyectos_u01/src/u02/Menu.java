package u02;

import java.util.Scanner;

/*
 * 1 comprimir archivo
 * 2 eliminar
 * 3 copiar archivo
 * 4 cerrar programa
 * Mostrar un error si no se elije ninguna */
public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("elije una de las siguientes opciones tecleando el número correspondiente a cada una:");
		System.out.println( "1 Comprimir archivo");
		System.out.println(  "2 Eliminar archivo");		
		System.out.println( "3 Copiar archivo");	
		System.out.println( "4 Cerrar programa");		
		int opcion = scan.nextInt();
		
		switch (opcion) {
		case 1 : System.out.println("Comprimiendo archivo...");
			
			break;
		case 2 : System.out.println("Eliminando archivo...");
		
		break;
		case 3 : System.out.println("Copiando archivo...");
		
		break;
		case 4 : System.out.println("Cerrando archivo...");

		break;
		
		default: System.err.println("no has elejido ninguna opción valida!");
		
		break;
		}
		
		scan.close();

	}

}
