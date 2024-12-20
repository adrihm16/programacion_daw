
	package u04;

	import org.apache.commons.lang3.StringUtils;

	public class utilidadesCadenas {

		/**
		 * esPalindromo: Este método debería verificar si una cadena es un palíndromo,
		 * lo que significa que la cadena se lee igual de izquierda a derecha que de
		 * derecha a izquierda.
		 * 
		 * @param cadena
		 * @return esPalindromo
		 */
		public static boolean esPalindromo(String cadena) {
			boolean esPalindromo = true;
			int pos = 0;
			while (pos < cadena.length() / 2) {
				if (cadena.charAt(pos) != cadena.charAt(cadena.length() - 1 - pos)) {
					esPalindromo = false;
				}
				pos++;
			}
			return esPalindromo;
			// OTRA OPCIÓN CON STRINGUTILS
			// return StringUtils.equals(cadena, StringUtils.reverse(cadena));
		}

		/**
		 * conteoVocales: Debería contar el número de vocales en una cadena,
		 * proporcionando así la cantidad total de letras 'a', 'e', 'i', 'o' y 'u'.
		 * Extra: Incluye las vocales acentuadas en español.
		 * @param cadena
		 * @return
		 */
		public static int conteoVocales(String cadena) {
			int vocales = 0;
			String vocalesRegex = "[aeiouAEIOUÁÉÍÓÚáéíóúüÜ]";
			for (int posicion = 0; posicion < cadena.length(); posicion++) {
				// cadenaTexto.matches(patron)
				if (Character.toString(cadena.charAt(posicion)).matches(vocalesRegex)) {
					vocales++;
				}
				//OTRA FORMA CON COMPARACIONES
//				if (cadena.charAt(posicion) == 'a' || cadena.charAt(posicion) == 'e' || cadena.charAt(posicion) == 'i'
//						|| cadena.charAt(posicion) == 'o' || cadena.charAt(posicion) == 'u') {
//					vocales++;
//				}
			}
			return vocales;
		}
		public static int contarPalabras (String cadena) {
			int palabras = 0;
			String [] palabrasArray = StringUtils.split(cadena, " ");
			return palabrasArray.length;
		}
	}

