package u04;

public class SumarMatrices {

	public static void main(String[] args) {
		int [][] matriz1 = {
				{2,4,2},
				{1,2,4},
				{5,4,2}};
		int [][] matriz2 = {
				{1,1,1},
				{1,1,1},
				{1,1,1}};
		int [][] suma = sumaMatrices(matriz1, matriz2);
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(suma[i][j]+"\t");
			}System.out.println();
		}
	}

	/**
	 * @param matriz1
	 * @param matriz2
	 */
	private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
		int[][]suma =new int [matriz1.length][matriz1[0].length];
		
		if (matriz1.length!=matriz2.length || matriz1[0].length!=matriz2[0].length) {
			System.err.println("La dimensión de las matrices debe ser la misma.");
		} else {
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2[0].length; j++) {
					suma [i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
		}
	return suma;
	}

}
