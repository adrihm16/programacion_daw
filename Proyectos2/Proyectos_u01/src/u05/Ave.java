package u05;

public abstract class Ave extends Animal {
	private boolean volador;
	/**
	 * @return the volador
	 */
	public boolean isVolador() {
		return volador;
	}
	public Ave(String lugarNacimiento, boolean volador) {
		super(lugarNacimiento, 2);
		this.volador = volador;
	}

	/**
	 * @param domestico the volador to set
	 */
	public void setVolador(boolean volador) {
		this.volador = volador;
	}
	public void poneHuevo() {
		System.out.println("El ave está poniendo un huevo");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un ave.\n").append(super.toString());
		return sb.toString();
	}
}
