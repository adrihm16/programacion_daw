package tareaBanco.persona;

import java.util.Random;

public class Persona {
	public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	private String nombre;
	private String apellido;
	private String dni;

	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.dni = this.generaDni();
	}

	public Persona(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	private String generaDni() {
		// 8 numeros y una letra
		Random random = new Random();
		int numero = random.nextInt(99999999) + 1;
		char letra = LETRAS.charAt(numero % 23);
		String dni = numero + String.valueOf(letra);
		while (dni.length() < 9) {
			dni = "0" + dni;
		}
		return dni;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona:\n");
		if (nombre != null && !nombre.isBlank()) {
			builder.append(nombre);
			builder.append(" " + apellido + "\n");
		}
			builder.append("D.N.I.: ");
			builder.append(dni);
			builder.append(". ");
		return builder.toString();
	}

}
