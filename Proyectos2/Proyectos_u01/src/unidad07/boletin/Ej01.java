package unidad07.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej01 {

	public static void main(String[] args) {
		final String rutaEntrada = "ficheros/ejercicio1.txt";
		File fileIn = new File(rutaEntrada);
		try {
			FileReader reader = new FileReader(fileIn);
			int caracterValue = reader.read();
			while (caracterValue != -1) {
				if (caracterValue != ' ') {
					if (caracterValue < 91 && caracterValue > 64) {
						System.out.print((char) (caracterValue + 32));
					} else if (caracterValue < 123 && caracterValue > 96) {
						System.out.print((char) (caracterValue - 32));
					}
				}
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