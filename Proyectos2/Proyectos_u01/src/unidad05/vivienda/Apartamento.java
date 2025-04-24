package unidad05.vivienda;

public class Apartamento extends Vivienda {
	private int piso;
	private char puerta;

	public Apartamento(String direccion, float metrosCuadrados, Propietario propietario, int piso, char puerta) {
		super(direccion, metrosCuadrados, propietario);
		this.piso = piso;
		this.puerta = puerta;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	public float calcularCuota() {
		float cuota = 0;
		float precioApartamento = 1.2f;
			cuota = this.getMetrosCuadrados() * precioApartamento;
		return cuota;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un apartamento cuyo piso y puerta son " + this.piso + " y puerta " + this.puerta + ".\n");
		 sb.append(super.toString());
		return sb.toString();
	}
	
}
