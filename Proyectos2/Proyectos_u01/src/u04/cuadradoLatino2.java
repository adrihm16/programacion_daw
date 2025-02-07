package u04;

import java.util.Scanner;

public class cuadradoLatino2 {

	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la dimensión del cuadrado latino");
		int dimension = sc.nextInt();
		int relleno = 1;
		int [][] cuadradoLatino = new int [dimension][dimension];
		for (int i = 0; i < cuadradoLatino.length; i++) {
				cuadradoLatino[0][i]= relleno;
				relleno++;
		
			}
	
		int ultimoNum=0;
		for (int i = 1; i < cuadradoLatino.length; i++) {
			ultimoNum= cuadradoLatino[i-1][dimension-1];
			for (int j = 1; j < cuadradoLatino.length; j++) {
				 cuadradoLatino[i][0]= ultimoNum;
				 cuadradoLatino[i][j]= cuadradoLatino[i-1][j-1];
				
			}
		}
		
		for (int i = 0; i < cuadradoLatino.length; i++) {
			for (int j = 0; j < cuadradoLatino.length; j++) {
				System.out.print(cuadradoLatino[i][j]+"\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
