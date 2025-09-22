package unidad07.ampliacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Gestisimal {
	static Almacen alm = new Almacen();
	static Set<Producto> productos = alm.getProductos(); 
	public static void main(String[] args) {
		boolean salir = false;
		do {
			mostrarMenu();
			Scanner scan = new Scanner(System.in);
			//obtener opcion
			int opc = Integer.parseInt(scan .nextLine());
			switch (opc) {
			case 1:
				//mostrar listado de productos
				break;
			case 2:
				//Dar de baja un producto por su codigo
				break;
			case 3:
				//Búsqueda de productos
				break;
			case 4:
				//Modificar pvp por su codigo
				break;
			case 5:
				// Actualización del almacen por fichero
				System.out.println("Introduce la ruta del fichero");
				String ruta = scan.nextLine();
				try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
					br.readLine();
					String linea = br.readLine();
					while (null != linea) {
						//codigo,descr,pre_compra,pre_venta,stock
						String[] producto = linea.split(",");
						String codigo = producto[0];
						String descr = producto[1];
						Float preCompra = Float.parseFloat(producto[1]);
						Float preVenta = Float.parseFloat(producto[2]);
						Integer stock = Integer.parseInt(producto[3]);
						Producto p = new Producto(codigo, descr, preCompra, preVenta, stock);
						productos.add(p);
					}
					br.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 6:
				salir = true;
				// Guardar estado actual en un fichero YYYYMMDD_gestisimal.csv
				break;

			default:
				System.err.println("Opción incorrecta!");
				break;
			}
		} while (!salir);
	}
	private static void mostrarMenu() {
		// TODO Auto-generated method stub
	}

}