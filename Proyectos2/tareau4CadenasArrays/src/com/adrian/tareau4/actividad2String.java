package com.adrian.tareau4;

import org.apache.commons.lang3.StringUtils;

public class actividad2String {
	public static void main(String[] args) {
        // Ejemplo de cadenas a comparar
        String cadena1 = "aa";
        String cadena2 = "bbb";

        // Uso el método A (Devuelve la cadena de mayor longitud)
        System.out.println("La cadena más larga es: " + metodoA(cadena1, cadena2));
    }

    /*
    metodoA
    Este método compara dos cadenas y devuelve la de mayor longitud.
    Si tienen la misma longitud, devuelve la primera cadena.

    Utiliza:
    StringUtils.length: Para obtener la longitud de las cadenas.
    StringUtils.defaultString: Para evitar problemas con valores null (Si la cadena es null establece el valor "" por defecto).
    StringUtils.equals: Para saber si las cadenas tienen la misma longitud.
    */
    public static String metodoA(String str1, String str2) {
        // Aseguramos que las cadenas no sean null
        String cadena1 = StringUtils.defaultString(str1);
        String cadena2 = StringUtils.defaultString(str2);

        // Comparación de longitud usando StringUtils.length
        if (StringUtils.length(cadena1) > StringUtils.length(cadena2)) {
            return cadena1;
        } else if (StringUtils.length(cadena1) < StringUtils.length(cadena2)) {
            return cadena2;
        } else { 
        //EL único caso que queda es que sean iguales, así que podríamos usar .equals pero no hace falta
        	return cadena1; 
        }

        
       
    }
}
