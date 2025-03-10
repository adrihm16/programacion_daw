package unidad05.productos;

public class ProductoUnitario extends Producto {
	private int cantidad;
	private double precio;

	public ProductoUnitario(String nombre, String categoria, int cantidad, double precio) {
		super(nombre, categoria);
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getImporteTotal() {
		double importe = 0;
		importe = this.cantidad * this.precio;
		return importe;
	}

	public void imprimir() {
		System.out.printf("nombre: %s \n cantidad %d \n precio: %f \n importe total: %f", this.nombre, this.cantidad,
				this.precio, getImporteTotal());
	}
}
