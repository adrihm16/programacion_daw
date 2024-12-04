package u04;

public class E11 {

	public static void main(String[] args) {
			int[][] arrayBidimensional = new int[4][5];
			for (int i = 0; i < arrayBidimensional.length; i++) {
				for (int j = 0; j < arrayBidimensional[0].length; j++) {
					int numAleatorio = (int) (Math.random() * 10);
					arrayBidimensional[i][j] = numAleatorio;
				}
			}
	}

}
