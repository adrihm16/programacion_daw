package ejercicio6banco;

import tareaBanco.persona.Persona;

public class cuentaAhorro extends CuentaBancaria {
	private double interesAnual;

	public cuentaAhorro(Persona titular, double saldo) {
		super(titular, saldo);
		this.interesAnual = 0.5d;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(super.toString()); // Llamar a toString() de CuentaBancaria
	    sb.append("Interés anual: " + interesAnual + "\n");
	    sb.append("******************************************************\n");
	    return sb.toString();
	}

}
