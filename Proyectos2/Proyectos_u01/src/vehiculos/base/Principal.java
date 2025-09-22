package vehiculos.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Concesionario concesionario = new Concesionario();
		boolean salir = false;

		while (!salir) {
			System.out.println("1. Nuevo vehículo");
			System.out.println("2. Listar vehículos");
			System.out.println("3. Buscar vehículo");
			System.out.println("4. Modificar kms vehículo");
			System.out.println("5. Eliminar vehículo");
			System.out.println("6. Mostrar número de vehículos");
			System.out.println("7. Salir");
			System.out.println("Elige una opción:");

			try {
				int opcion = scan.nextInt();
				scan.nextLine();

				switch (opcion) {
				case 1:
					System.out.println("Introduce la marca:");
					String marca = scan.nextLine();
					System.out.println("Introduce la matrícula:");
					String matricula = scan.nextLine();
					System.out.println("Introduce el número de kilómetros:");
					int kms = scan.nextInt();
					System.out.println("Introduce el año de matriculación:");
					int anio = scan.nextInt();
					System.out.println("Introduce la descripción:");
					scan.nextLine();
					String descripcion = scan.nextLine();
					System.out.println("Introduce el precio:");
					float precio = scan.nextFloat();
					System.out.println("Introduce el DNI del propietario:");
					scan.nextLine();
					String dniPropietario = scan.nextLine();

					Vehiculo vehiculo = new Vehiculo(marca, matricula, kms, anio, descripcion, precio, dniPropietario);
					int resultado = concesionario.insertarVehiculo(vehiculo);
					if (resultado == 0) {
						System.out.println("Vehículo añadido correctamente.");
					} else if (resultado == -2) {
						System.out.println("Error: El vehículo con matrícula " + matricula + " ya existe.");
					}
					break;

				case 2:
					concesionario.listarVehiculos();
					break;

				case 3:
					System.out.println("Introduce la matrícula del vehículo a buscar:");
					String matriculaBuscar = scan.nextLine();
					Vehiculo v = concesionario.buscaVehiculo(matriculaBuscar);
					if (v != null) {
						System.out.println("Vehículo encontrado: " + v);
					} else {
						System.out.println("No se encontró un vehículo con matrícula " + matriculaBuscar);
					}
					break;

				case 4:
					System.out.println("Introduce la matrícula del vehículo:");
					String matriculaKms = scan.nextLine();
					System.out.println("Introduce el nuevo número de kilómetros:");
					int nuevosKms = scan.nextInt();
					scan.nextLine();
					if (concesionario.actualizaKms(matriculaKms, nuevosKms)) {
						System.out.println("Kilómetros actualizados correctamente.");
					} else {
						System.out.println("No se encontró un vehículo con matrícula " + matriculaKms);
					}
					break;

				case 5:
					System.out.println("Introduce la matrícula del vehículo a eliminar:");
					String matriculaEliminar = scan.nextLine();
					if (concesionario.eliminarVehiculo(matriculaEliminar)) {
						System.out.println("Vehículo eliminado correctamente.");
					} else {
						System.out.println("No se encontró un vehículo con matrícula " + matriculaEliminar);
					}
					break;

				case 6:
					int numVehiculos = concesionario.getNumVehiculos();
					System.out.println("Número de vehículos en el concesionario: " + numVehiculos);
					break;

				case 7:
					salir = true;
					System.out.println("Saliendo del programa...");
					break;

				default:
					System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 7.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida, introduce un número.");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				scan.nextLine();
			}
		}
		scan.close();
	}
}