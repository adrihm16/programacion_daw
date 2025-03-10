package tareaBanco.persona;

import java.util.Random;

import unidad05.util.Utilidades;

public class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private String dni;

	// Constructores
	/**
	 * Un constructor por defecto
	 */
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.dni = this.generaDni();
	}

	/**
	 * Un constructor con el nombre y apellidos.
	 */
	public Persona(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// getters y setters

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param nombre the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	// métodos de instancia
	/**
	 * Devuelve un dni aleatoriamente
	 * 
	 * @return dni
	 */
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
