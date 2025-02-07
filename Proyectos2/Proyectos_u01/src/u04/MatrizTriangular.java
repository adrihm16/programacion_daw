package u04;

public class MatrizTriangular {

	public static void main(String[] args) {
		int [][] matrizTri = {
				{1, 0, 0}, 
				{0, 1, 0}, 
				{0, 0, 1}};
		
		boolean TrianguloSuperior = true;
		boolean TrianguloInferior = true;
		for (int i = 0; i < matrizTri.length; i++) {
			for (int j = 0; j < matrizTri.length; j++) {
				if (j>i && matrizTri [i][j] != 0) {
					TrianguloSuperior = false;
				}
				if (i>j && matrizTri [i][j] != 0) {
					TrianguloInferior = false;
				}
				}
			}
		if (TrianguloInferior || TrianguloInferior) {
			System.out.println("Es triangular");
		} else {
			System.out.println("No es triangular");
		}
		}
	}


