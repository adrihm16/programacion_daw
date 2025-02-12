package u04;

import java.util.Scanner;

public class transponerMatriz {
	/**
	 * Dada una matriz A su transpuesta AT se obtiene intercambiando las filas por columnas y las columnas por filas. 
	 * Por ejemplo, si tenemos la matriz A de 2 filas y 4 columnas:
	 * 1  2  3  4
	 * 5  6  7  8
	 * Su matriz transpuesta AT es una matriz de 4 filas y 2 columnas con este contenido: 
	 *   1  5
	 *   2  6
	 *   3  7
	 *   4  8
	 *   La primera fila de A se convierte en la primera columna de la matriz transpuesta y la segunda fila de A se convierte en la segunda columna de la matriz transpuesta.
	 *   Si la dimensión de la matriz A es 2 x 3 (2 filas y 3 columnas) la dimensión de su matriz transpuesta será 3 x 2 (3 filas y 2 columnas).
	 *   Es decir, si la matriz A se ha creado de tamaño A[filas][columnas] su matriz transpuesta se debe crear de tamaño AT[columnas][filas]

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nº de filas de la matriz");
		int filas = sc.nextInt();
		System.out.println("Introduce el nº de columnas de la matriz");
		int columnas = sc.nextInt();
		int matriz [][] = new int  [filas][columnas];
		int relleno = 1;
		int i=0;
		int j=0;
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[0].length; j++) {
				matriz [i][j] = relleno;
				relleno++;
				System.out.print(matriz [i][j]+"\t");
			} System.out.println();
		}
		int matrizTrans [][] = new int [columnas][filas];
		for (j = 0; j < matrizTrans.length; j++) {
			for (i = 0; i< matrizTrans[0].length; i++) {
				matrizTrans [j][i] = matriz [i][j];
				System.out.print(matrizTrans[j][i]+"\t");
			}System.out.println();
		}
	}

}
