package ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperEcoMercado {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<String, Double>();
		Map<String, Integer> productosComprados = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("INPUT: ");
			String input = sc.next().toUpperCase();
			switch (input) {
			case "UPDATE":
				String direccion = "ficheros/" + sc.next();
				try (BufferedReader br = new BufferedReader(new FileReader(direccion))) {
					br.readLine();
					String linea = br.readLine();
					while (null != linea) {
						String[] producto = linea.split(";");
						String nombreProd = producto[0];
						Double precioProd = Double.parseDouble(producto[1]);
						// TODO ELIMINAR PRODUCTOS SI SU VALOR ES 0 O MENOR
						if (precioProd <= 0) {
							if (productos.containsKey(nombreProd)) {
								productos.remove(precioProd);
							}
						} else {
							productos.put(nombreProd, precioProd);
						}
						productos.put(nombreProd, precioProd);
						linea = br.readLine();
					}
					br.close();
					System.out.println("PRODUCTOS ACTUALIZADOS CON ÉXITO");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case "EXIT":
				LocalDate fechaActual = LocalDate.now();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd");
				String fechaFormateada = fechaActual.format(formato);
				String nombreArchivo = "ficheros/cierre_" + fechaFormateada + ".csv";

				try {
					BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));
					escritor.write("Producto;Precio");
					escritor.newLine();
					for (String nombreProd : productos.keySet()) {
						Double precioProd = productos.get(nombreProd);
						String linea = nombreProd + ";" + precioProd;
						escritor.write(linea);
						escritor.newLine();
					}
					escritor.close();
					System.out.println("Archivo '" + nombreArchivo + "' creado correctamente.");
				} catch (IOException e) {
					e.printStackTrace();
				}
				exit = true;
				break;
			default:
				// aqui empieza una compra
				boolean salir = false;
				do {
					// TENGO QUE PONER EL INPUT PERO QUE LA PRIMERA VEZ QUE SE EJECUTE EL WHILE
					// NO CAMBIE EL VALOR DEL INPUT
					if (!productosComprados.isEmpty()) {
						System.out.println("INPUT: ");
						input = sc.next().toUpperCase();
					}
					if (input.equals("0")) {
						salir = true;
						mostrarFactura(productos, productosComprados);
						System.out.println();
					} else if (input.matches(".*[0-9].*")) { // si contiene una letra doy por sentado que se trata de un
																// producto
						int cantidad = Integer.parseInt(input);
						System.out.println("INPUT: ");
						input = sc.next().toUpperCase();
						if (productosComprados.containsKey(input)) {
							productosComprados.put(input, productosComprados.get(input) + cantidad);
						} else {
							productosComprados.put(input, cantidad);
						}
					} else {
						// nombre de un producto
						if (productosComprados.containsKey(input)) {
							productosComprados.put(input, productosComprados.get(input) + 1);
						} else {
							productosComprados.put(input, 1);
						}
					}

				} while (!salir);
				break;
			}
		} while (!exit);
	}

	private static void mostrarFactura(Map<String, Double> productos, Map<String, Integer> productosComprados) {
		Double total = 0d;
		System.out.println("""
				FACTURA
				Producto Precio\tCantidad subtotal
				---------------------------------""");
		for (String nombreProd : productosComprados.keySet()) {
			Double precioProd = productos.get(nombreProd);
			Integer cantidadPro = productosComprados.get(nombreProd);
			Double subtotal = (precioProd * cantidadPro);
			total += subtotal;
			System.out.printf("%s\t  %.2f\t   %d\t   %.2f\n", nombreProd, precioProd, cantidadPro, subtotal);
		}
		System.out.println("---------------------------------");
		System.out.printf("Total: %.2f €", total);

	}

	private static void mostrarProductos(Map<String, Double> productos) {
		for (String nombreProd : productos.keySet()) {
			Double precioProd = productos.get(nombreProd);
			System.out.println(nombreProd + " --> " + precioProd + " €");
		}

	}

}
