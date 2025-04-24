package unidad07.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del primer archivo que quieres copiar");
		final String rutaEntrada1 = "ficheros/" + sc.nextLine();
		File fileIn = new File(rutaEntrada1);
		System.out.println("Introduce el nombre del segundo archivo que quieres copiar");
		final String rutaEntrada2 = "ficheros/" + sc.nextLine();
		File fileIn2 = new File(rutaEntrada2);
		try {
			FileReader reader = new FileReader(fileIn);
			int caracterValue = reader.read();
			while (caracterValue != -1) {
				System.out.println();
				caracterValue = reader.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
