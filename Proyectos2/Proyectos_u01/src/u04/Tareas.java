package u04;

import java.util.Iterator;
import java.util.Scanner;

import u01.string;

/*
 *Crea una aplicación en Java para gestionar una lista de tareas. 
 *La aplicación debe permitir:
 *Añadir una nueva tarea con un título y una descripción.
 *Listar todas las tareas pendientes.
 *Marcar una tarea como completada.
 *Eliminar una tarea por su índice.
 *Buscar tareas que contengan una palabra clave en el título o la descripción.
 */
public class Tareas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		String[] tareas = new String[5];
		String[] descripcion = new String[tareas.length];
		boolean[] pendientes = new boolean[tareas.length];
		int posicionTarea = 0;
		int opcion = 20;
		int indiceTarea = 0;
		do {
		System.out.println("Introduce una opción para manejar las tareas:\r\n"
				+ "1.- Añadir una tarea con titulo y descripcion\r\n" + "2.- Listar todas las tareas pendientes\r\n"
				+ "3.- Marcar una tarea como completada\r\n" + "4.- Eliminar una tarea por su índice\r\n"
				+ "5.- Buscar tareas por palabras clave");
		opcion = sc.nextInt();
		switch (opcion) {
		case 0:
			System.out.println("Hasta pronto!");
			break;
		case 1:
			System.out.println("Introduce el nombre de la tarea");
			tareas[posicionTarea] = sc.nextLine();
			System.out.println("Introduce la descripción de la tarea");
			descripcion[posicionTarea] = sc.nextLine();
			pendientes [posicionTarea] = true;
			posicionTarea++;
			break;
		case 2:
			for (int i = 0; i < tareas.length; i++) {
				if (!(tareas[i].equals(null))||pendientes[i]==false) {
					System.out.print("VACÍO\t");
				}else {
					System.out.print((tareas[i])+i+"\t" );
				}
			}
			break;
		case 3:
			System.out.println("Introduce el índice de la tarea pendiente");
			indiceTarea = sc.nextInt();
			sc.nextLine();
			pendientes[indiceTarea] = false;
			break;
		case 4:
			System.out.println("Introduce el índice de la tarea a eliminar");
			indiceTarea = sc.nextInt();
			sc.nextLine();
			tareas[indiceTarea] = null;
			break;
		case 5:
			
			break;

		default:
			break;
		}
		} while (opcion !=0);
		}

}
