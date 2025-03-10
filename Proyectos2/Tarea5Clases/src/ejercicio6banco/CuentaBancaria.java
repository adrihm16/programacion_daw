package ejercicio6banco;

import java.util.Iterator;
import java.util.Random;

import tareaBanco.persona.Persona;

public abstract class CuentaBancaria {
	private Persona titular;
	private double saldo;
	private String iban;

	public CuentaBancaria(Persona titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.iban = generarIBAN();
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	private String generarIBAN() {
		StringBuilder iban = new StringBuilder();
		String codigoPais = "ES";
		iban.append(codigoPais);
		for (int i = 0; i < 19; i++) {
			  iban.append((int) (Math.random() * 10)); 
		}
		return iban.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("******************************************************\n");
		sb.append("DATOS CUENTA\n");
		sb.append("Nombre y apellido del titular: " + titular.getNombre() + " " + titular.getApellido() + "\n");
		sb.append("saldo: " + saldo + "\n");
		sb.append("IBAN: " + iban + "\n");
		return sb.toString();
	}

}
