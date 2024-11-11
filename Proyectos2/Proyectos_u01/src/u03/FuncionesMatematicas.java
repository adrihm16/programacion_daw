package u03;

public class FuncionesMatematicas {

	/**
	 * Devuelve true si el número pasado por parámetro es primo
	 * 
	 * @param numero
	 * @return esPrimo
	 */
	public static boolean esPrimo(long numero) {
		boolean esPrimo = true;

		int divisor = 2;
		while (esPrimo && divisor < numero / 2) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		return esPrimo;
	}

	/**
	 * Devuelve el siguiente número primo a partir del parámetro de entrada
	 * 
	 * @param numero
	 * @return sigPrimo
	 */
	public static long siguientePrimo(long numero) {
		long NumInicial = numero;
		long SigNum = NumInicial;
		long SigPrimo = 0;
		boolean primoEncontrado = false;
		do {
			primoEncontrado = false;
			SigNum++;
			if (esPrimo(SigNum)) {
				SigPrimo = SigNum;
				primoEncontrado = true;
			}
			esPrimo(SigNum);
		} while (!primoEncontrado);

		return SigPrimo;
	}

	/**
	 * Devuelve el número de dígitos que tiene el input
	 * 
	 * @param numero
	 * @return numCifras
	 */
	public static int digitos(long numero) {

		int numCifras = 0;
		long numActual = numero;
		numCifras = 1;
		while (numActual / 10 != 0) {
			numCifras++;
			numActual = numActual / 10;
		}

		return numCifras;
	}

	public static char letraDNI(long numDNI) {
		String letras = "TRWAGMYPFDXBNJZSQVHLCKE";
		int resto = (int) (numDNI % 23);
		char letraDNI = letras.charAt(resto);
		return letraDNI;
	}
	public static boolean dniCorrecto(String DNI) {
		boolean correcto=false;

	 String numDniString= DNI.substring(0, 8);
	 long numDni = Long.parseLong(numDniString);
	 FuncionesMatematicas.letraDNI(numDni);
	 return correcto;
	}
}