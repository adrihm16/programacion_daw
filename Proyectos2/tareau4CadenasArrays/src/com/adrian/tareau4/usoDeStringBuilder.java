package com.adrian.tareau4;

public class usoDeStringBuilder {
    public static void main(String[] args) {
        String texto = "Hola Mundo";

        StringBuilder vocales = new StringBuilder();
        StringBuilder consonantes = new StringBuilder();

        //Creo el for para recorrer el texto y reconocer y clasificar las vocales y las consonantes.
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vocales.append(c);
            } else if (Character.isLetter(c)) {
                consonantes.append(c);
            }
        }
        System.out.println("Vocales: " + vocales.toString());
        System.out.println("Consonantes: " + consonantes.toString());
    }
}
