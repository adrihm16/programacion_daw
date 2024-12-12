package u04;

import java.util.Scanner;

public class EjCamping {
	 static Scanner in;

	  public static boolean casoDePrueba() {
int c = in.nextInt();
int f = in.nextInt();
int a = in.nextInt();
final int sombra=1;
final int sol=0;
final int arbol=2;
	    // LEER CASO DE PRUEBA
	    if (c == 0 && f == 0 && a == 0) {
	      return false;
	      }
	    else {
	      // CÓDIGO PRINCIPAL AQUÍ
	    int camping[][]=new int[c][f];
	      // Procesa un único caso leyendo con
	      // in.next*()

	      return true;
	    }

	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    while(casoDePrueba())
	      ;

	  } // main

}
