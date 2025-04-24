package unidad05.vivienda;

public class Casa extends Vivienda {

	private boolean piscina;
	private boolean jardin;

	public Casa(String direccion, float metrosCuadrados, Propietario propietario, boolean piscina, boolean jardin) {
		super(direccion, metrosCuadrados, propietario);
		this.piscina = piscina;
		this.jardin = jardin;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public float calcularCuota() {
		float cuota = 0;
		float precioCasa = 1.5f;
		cuota = this.getMetrosCuadrados() * precioCasa;
		if (jardin || piscina) {
			if ((jardin && !piscina) || (!jardin && piscina)) {
				cuota += 30f;
			}
			if (jardin && piscina) {
				cuota += 45f;
			}
		}
		return cuota;
	}

}
