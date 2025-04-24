package unidad07;

import java.io.File;
import java.io.IOException;

public class EjemploFile {

	public static void main(String[] args) {
		String archivo = "ArchivoVacio.txt";
		File f = new File(archivo);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
