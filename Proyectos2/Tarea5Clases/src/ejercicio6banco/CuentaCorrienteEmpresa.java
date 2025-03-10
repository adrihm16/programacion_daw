package ejercicio6banco;

import tareaBanco.persona.Persona;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
	private double maxDescubierto;
	private double interesDescubierto = 0.05d;
	private double comisionFija = 0.05d;
	public CuentaCorrienteEmpresa(Persona titular, double saldo, String agentes, double maxDescubierto) {
		super(titular, saldo, agentes);
		this.maxDescubierto = maxDescubierto;
	}
	public double getMaxDescubierto() {
		return maxDescubierto;
	}
	public void setMaxDescubierto(double maxDescubierto) {
		this.maxDescubierto = maxDescubierto;
	}
	public double getInteresDescubierto() {
		return interesDescubierto;
	}
	public void setInteresDescubierto(double interesDescubierto) {
		this.interesDescubierto = interesDescubierto;
	}
	public double getComisionFija() {
		return comisionFija;
	}
	public void setComisionFija(double comisionFija) {
		this.comisionFija = comisionFija;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(super.toString()); // Llamar a toString() de CuentaCorriente
	    sb.append("Máximo descubierto: " + maxDescubierto + "\n");
	    sb.append("Interés por descubierto: " + interesDescubierto + "\n");
	    sb.append("Comisión fija: " + comisionFija + "\n");
	    sb.append("******************************************************\n");
	    return sb.toString();
	}

}
