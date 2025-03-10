package unidad05.productos;

public class Supermercado {
	public static void main(String[] args) {
		String cliente = "Inés";
		
		// Crear varios productos de tipo ProductoPeso
        ProductoPeso producto1 = new ProductoPeso("Manzana", "Frutas", 2.5, 3.0);
        ProductoPeso producto2 = new ProductoPeso("Plátano", "Frutas", 1.8, 2.5);
        ProductoPeso producto3 = new ProductoPeso("Pollo", "Carnes", 5.0, 6.0);
        ProductoPeso producto4 = new ProductoPeso("Leche", "Lácteos", 3.0, 1.2);
        ProductoPeso producto5 = new ProductoPeso("Aguacate", "Frutas", 2.0, 4.0);

        // Crear varios productos de tipo ProductoUnitario
        ProductoUnitario producto6 = new ProductoUnitario("Caja de Cereales", "Alimentos", 3, 2.5);
        ProductoUnitario producto7 = new ProductoUnitario("Papel Higiénico", "Hogar", 6, 1.8);
        ProductoUnitario producto8 = new ProductoUnitario("Jugo de Naranja", "Bebidas", 2, 1.3);
        ProductoUnitario producto9 = new ProductoUnitario("Lámpara LED", "Electrodomésticos", 1, 15.0);
        ProductoUnitario producto10 = new ProductoUnitario("Silla de Oficina", "Muebles", 1, 85.0);
       
        //Crear cesta
        Producto[] cesta = new Producto[10];
        cesta[0] = producto1;
        cesta[1] = producto2;
        cesta[2] = producto3;
        cesta[3] = producto4;
        cesta[4] = producto5;
        cesta[5] = producto6;
        cesta[6] = producto7;
        cesta[7] = producto8;
        cesta[8] = producto9;
        cesta[9] = producto10;
        for (Producto producto : cesta) {
        	//tambien se puede hacer con .getclass()
			if (producto instanceof ProductoUnitario) {
				
			} else {

			}
		}
	}

}
