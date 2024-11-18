package com.adrianHerrera.tarea2;

public class UtilidadesMatematicas {
	/**
	 * Devuelve la posición de un digito en un número.
	 * 
	 * @param numero
	 *
	 * @param digito
	 *
	 * @return posicion
	 *
	 * @return -1
	 */
	public static int PosicionDeDigito(int numero, int digito) throws Exception {
		if (digito > 9) {
			throw new Exception("El dígito debe estar entre 0 y 9.");
		}
		if (numero < 0) {
			numero *= -1;
		}
		int posicion = 1;
		int numeroAct = numero;
		while (numeroAct >= 0) {
			int digitoAct = numeroAct % 10;
			if (digitoAct == digito) {
				return posicion;
			}
			numeroAct /= 10;
			posicion++;

		}
		return -1;
	}

	/**
	 * Devuelve el trozo seleccionado por un número.
	 * 
	 * @param numero
	 *
	 * @param inicio
	 * 
	 * @param fin
	 *
	 * @return trozo
	 */
	public static int trozoNumero(int numero, int inicio, int fin) throws Exception {
		if (inicio < 0 || fin < 0 || inicio > fin) {
			throw new Exception("Las posiciones deben ser positivas y el inicio debe ser mayor que  el fin.");
		}
		if (numero < 0) {
			numero *= -1;
		}
		int numeroAct = numero;
		int longitud = 0;
		while (numeroAct > 0) {
			numeroAct /= 10;
			longitud++;
		}
		if (longitud == 0) {
			longitud = 1;
		}
		if (inicio >= longitud) {
			throw new Exception("La posición inicial debe ser menor que la longitud del numero");
		}
		numero /= Math.pow(10, longitud - fin - 1);
		int digExtraidos = (int) Math.pow(10, fin - inicio + 1);
		int trozo = numero % digExtraidos;

		if (numero < 0) {
			return -trozo;
		}
		return trozo;
	}

	/**
	 * Devuelve dos numeros juntos
	 * 
	 * @param numero1
	 *
	 * @param numero2
	 *
	 * @return resultado
	 */
	public static int juntaNumeros(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1 * 10; 
			// Por si el numero 2 es = 0
		}
		boolean esNegativo1 = numero1 < 0;
		boolean esNegativo2 = numero2 < 0;

		if (esNegativo1) {
			numero1 *= -1;
		}
		if (esNegativo2) {
			numero2 *= -1;
		}

		int digitos = 0;
		int numero2Act = numero2;
		while (numero2Act > 0) {
			numero2Act /= 10;
			digitos++;
		}
		if (digitos == 0) {
			digitos = 1;
		}

		int resultado = numero1 * (int) Math.pow(10, digitos) + numero2;

		if (esNegativo1) {
			resultado = -resultado;
		}

		return resultado;
	}
	/**
	 * Devuelve la factorial de un número
	 * 
	 * @param numero
	 *
	 * @return resultado
	 */
	public static long factorial(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("El número debe ser positivo.");
		}
		long resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}
	/**
	 * Calcula el cambio mínimo de una cantidad determinada de dinero.
	 * 
	 * @param numero1
	 */
	public static void cambioExacto(double cantidad) {
		
		double cantidadEnCentimosDouble = (cantidad * 100);
		int cantidadEnCentimos = (int)cantidadEnCentimosDouble;

		System.out.println("El cambio es: ");

		if (cantidadEnCentimos >= 50000) {
			int billetes500 = cantidadEnCentimos / 50000;
			System.out.println(billetes500 + " billete(s) de 500 €");
			cantidadEnCentimos %= 50000;
		}

		if (cantidadEnCentimos >= 20000) {
			int billetes200 = cantidadEnCentimos / 20000;
			System.out.println(billetes200 + " billete(s) de 200 €");
			cantidadEnCentimos %= 20000;
		}

		if (cantidadEnCentimos >= 10000) {
			int billetes100 = cantidadEnCentimos / 10000;
			System.out.println(billetes100 + " billete(s) de 100 €");
			cantidadEnCentimos %= 10000;
		}

		if (cantidadEnCentimos >= 5000) {
			int billetes50 = cantidadEnCentimos / 5000;
			System.out.println(billetes50 + " billete(s) de 50 €");
			cantidadEnCentimos %= 5000;
		}

		if (cantidadEnCentimos >= 2000) {
			int billetes20 = cantidadEnCentimos / 2000;
			System.out.println(billetes20 + " billete(s) de 20 €");
			cantidadEnCentimos %= 2000;
		}

		if (cantidadEnCentimos >= 1000) {
			int billetes10 = cantidadEnCentimos / 1000;
			System.out.println(billetes10 + " billete(s) de 10 €");
			cantidadEnCentimos %= 1000;
		}

		if (cantidadEnCentimos >= 500) {
			int billetes5 = cantidadEnCentimos / 500;
			System.out.println(billetes5 + " billete(s) de 5 €");
			cantidadEnCentimos %= 500;
		}

		if (cantidadEnCentimos >= 200) {
			int monedas2 = cantidadEnCentimos / 200;
			System.out.println(monedas2 + " moneda(s) de 2 €");
			cantidadEnCentimos %= 200;
		}

		if (cantidadEnCentimos >= 100) {
			int monedas1 = cantidadEnCentimos / 100;
			System.out.println(monedas1 + " moneda(s) de 1 €");
			cantidadEnCentimos %= 100;
		}

		if (cantidadEnCentimos >= 50) {
			int monedas50 = cantidadEnCentimos / 50;
			System.out.println(monedas50 + " moneda(s) de 50 cts");
			cantidadEnCentimos %= 50;
		}

		if (cantidadEnCentimos >= 20) {
			int monedas20 = cantidadEnCentimos / 20;
			System.out.println(monedas20 + " moneda(s) de 20 cts");
			cantidadEnCentimos %= 20;
		}

		if (cantidadEnCentimos >= 10) {
			int monedas10 = cantidadEnCentimos / 10;
			System.out.println(monedas10 + " moneda(s) de 10 cts");
			cantidadEnCentimos %= 10;
		}

		if (cantidadEnCentimos >= 5) {
			int monedas5 = cantidadEnCentimos / 5;
			System.out.println(monedas5 + " moneda(s) de 5 cts");
			cantidadEnCentimos %= 5;
		}

		if (cantidadEnCentimos >= 2) {
			int monedas2 = cantidadEnCentimos / 2;
			System.out.println(monedas2 + " moneda(s) de 2 cts");
			cantidadEnCentimos %= 2;
		}

		if (cantidadEnCentimos >= 1) {
			int monedas1 = cantidadEnCentimos;
			System.out.println(monedas1 + " moneda(s) de 1 cts");
		}
	}
}
