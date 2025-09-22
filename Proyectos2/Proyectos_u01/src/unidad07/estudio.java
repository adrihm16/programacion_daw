package unidad07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class estudio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ruta del fichero");
		String ruta = sc.nextLine();
		try {
			FileReader fr = new FileReader(new File(ruta));
			boolean fin = false;
			do {
				int caracterValue = fr.read();
				if (caracterValue != -1) {
					char caracter = (char) (caracterValue);
					System.out.println(caracter);
				} else {
					fin = true;
				}
				
			} while (!fin);
			System.out.println("fin");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea = "";
			do {
				if (!linea.equals("")) {
					System.out.println(linea);
				}
				linea = br.readLine();
			} while (null != linea);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
