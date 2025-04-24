package unidad05.vivienda;

import java.util.Random;

import unidad05.util.Utilidades;

public class Propietario {
	private String nombreCompleto;
	private String dni;

	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public Propietario(String nombreCompleto) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = generaDni();
	}

	private String generaDni() {
		// 8 numeros y una letra
		Random random = new Random();
		int numero = random.nextInt(99999999) + 1;
		char letra = Utilidades.LETRAS.charAt(numero % 23);
		String dni = numero + String.valueOf(letra);
		while (dni.length() < 9) {
			dni = "0" + dni;
		}
		return dni;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
}
