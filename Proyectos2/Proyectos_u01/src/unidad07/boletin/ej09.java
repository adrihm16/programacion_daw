package unidad07.boletin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ej09 {

	public static void main(String[] args) {
		String rutaIn = "ficheros/palabras_in.txt";
		String rutaOut = "ficheros/palabras_out.txt";
		BufferedReader br2;
		try (BufferedReader br = new BufferedReader(new FileReader(rutaIn))) {
			br2 = new BufferedReader(new FileReader(rutaIn));
			String linea1 = br.readLine();
			String linea2 = br.readLine();
			ArrayList<String> lista = new ArrayList<String>();
			boolean esNull1 = false;
			boolean esNull2 = false;
			do {
				if (null == linea1) {
					esNull1 = true;
				}
				if (null == linea2) {
					esNull2 = true;
				}
				if (!esNull1) {
					linea1 = br.readLine();
					lista.add(linea1 + "\n");
				}
				if (!esNull2) {
					linea2 = br.readLine();
					lista.add(linea2 + "\n");
				}
			} while (null != linea1 || null != linea2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
