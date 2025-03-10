package ejercicio6banco;

import tareaBanco.persona.Persona;

public class CuentaCorrientePersonal extends CuentaCorriente {
private double comisionAnual;
	public CuentaCorrientePersonal(Persona titular, double saldo, String agentes) {
		super(titular, saldo, agentes);
		this.comisionAnual = 0.05d;
	}
	public double getComisionAnual() {
		return comisionAnual;
	}
	public void setComisionAnual(double comisionAnual) {
		this.comisionAnual = comisionAnual;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(super.toString()); // Llamar a toString() de CuentaCorriente
	    sb.append("Comisión anual: " + comisionAnual + "\n");
	    sb.append("******************************************************\n");
	    return sb.toString();
	}

}
