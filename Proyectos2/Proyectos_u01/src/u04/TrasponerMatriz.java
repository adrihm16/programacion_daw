package u04;

import java.util.Scanner;

public class TrasponerMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los valores de la matriz para obtener la transpuesta");
		System.out.println("Introduce el número de filas");
		int filas = sc.nextInt();
		System.out.println("Introduce el número de columnas");
		int cols = sc.nextInt();
		int [][] matriz = new int [filas][cols];
		int numAux = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=numAux;
				numAux++;
			}
		}
		
		System.out.println("Matriz inicial");
		mostrarMatriz(matriz);
		
		System.out.println("Matriz traspuesta");
		
		}
	

	/**
	 * @param matriz
	 */
	private static void mostrarMatriz(int[][] matriz) {
		//Mostrar matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
				}
			System.out.println("");
		}
	}
}
