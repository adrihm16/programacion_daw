package unidad05.productos;

public class ProductoPeso extends Producto {
	private double peso;
	private double precioXPeso;

	public ProductoPeso(String nombre, String categoria, double peso, double precioXPeso) {
		super(nombre, categoria);
		this.peso = peso;
		this.precioXPeso = precioXPeso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioXPeso() {
		return precioXPeso;
	}

	public void setPrecioXPeso(double precioXPeso) {
		this.precioXPeso = precioXPeso;
	}
	public double getImporteTotal() {
		double importe = 0;
		importe = this.peso * this.precioXPeso;
		return importe;
	}
	public void imprimir() {
		System.out.printf("nombre: %s \n peso %d \n precio por peso: %f \n importe total: %f", this.nombre, this.peso,
				this.precioXPeso, getImporteTotal());
	}
}
