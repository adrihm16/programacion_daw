package ejercicio6banco;

import java.util.Arrays;

import tareaBanco.persona.Persona;

public abstract class CuentaCorriente extends CuentaBancaria {
	// La lista se rellena poniendo los nombres de las entidades separadas por
	// comas.
	private String[] listaAgentes;

	public CuentaCorriente(Persona titular, double saldo, String agentes) {
		super(titular, saldo);
		this.listaAgentes = agentes.split(",");
	}

	public String[] getListaAgentes() {
		return listaAgentes;
	}

	public void setListaAgentes(String listaAgentes) {
		this.listaAgentes = listaAgentes.split(",");
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(super.toString()); // Llamar a toString() de CuentaBancaria
	    sb.append("Lista de agentes: " + Arrays.toString(listaAgentes) + "\n");
	    return sb.toString();
	}


}
