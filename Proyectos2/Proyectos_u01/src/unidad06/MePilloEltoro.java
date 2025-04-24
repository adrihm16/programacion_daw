package unidad06;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MePilloEltoro {

		  static Scanner in;

		  public static boolean casoDePrueba() {
			  int casos = in.nextInt();
			  in.nextLine();
			  Map<String, Integer> tareas = new TreeMap<String, Integer>();
		    if (casos == 0)
		      return false;
		    else {
		      // CÓDIGO PRINCIPAL AQUÍ
		      // Procesa un único caso leyendo con
		      // in.next*()
		    	for (int i = 0; i < casos; i++) {
					String nombreAlumno = in.nextLine();
					String notaTarea = in.nextLine();
					if (notaTarea.equals("CORRECTO")) {
						
					} else {

					}
				}
		      return true;
		    }

		  } // casoDePrueba

		  public static void main(String[] args) {

		    in = new java.util.Scanner(System.in);

		    while(casoDePrueba())
		      ;

		  } // main

}
