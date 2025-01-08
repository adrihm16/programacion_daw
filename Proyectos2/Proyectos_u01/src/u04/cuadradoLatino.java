package u04;

import java.util.Scanner;

/**
 * Crear un cuadrado latino en Java
 * 
 * Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
 * en la que su primera fila contiene los N primeros números naturales y cada
 * una de las filas siguientes contiene la rotación de la fila anterior un lugar
 * a la derecha.
 * 
 * Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4
 * x 4 con el siguiente contenido:
 *
 * 
 * 1 2 3 4
 * 4 1 2 3
 * 3 4 1 2
 * 2 3 4 1
 */
public class cuadradoLatino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la dimensión del cuadrado latino");
		int n = sc.nextInt();
		int [][] cuadradoLatino= new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce el siguiente número de la primera fila");
			int numActual = sc.nextInt();
			cuadradoLatino[0][i] = numActual;
		}
		//Rellenar el resto de filas con rotaciones de la anterior
		int numAux = cuadradoLatino[0][n-1];
		for (int i = n-2; i >= 0 ; i--) {
		
		}
		sc.close();
	}

}
