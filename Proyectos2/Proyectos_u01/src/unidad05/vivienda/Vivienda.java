package unidad05.vivienda;

public abstract class Vivienda {

	private String direccion;
	private float metrosCuadrados;
	private Propietario propietario;

	public Vivienda(String direccion, float metrosCuadrados, Propietario propietario) {
		super();
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.propietario = propietario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Su propietario es " + this.propietario.getNombreCompleto());
		sb.append(", la dirección de la vivienda es" + this.direccion + ".\n");
		sb.append("La vivienda tiene " + this.metrosCuadrados + "metros cuadrados.");
		return sb.toString();
	}

}
